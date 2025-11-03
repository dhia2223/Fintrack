#!/usr/bin/env python3
"""
Project Source Code Aggregator
Generates a single Markdown file with all source code organized by file structure.
"""

import os
import argparse
import fnmatch
from pathlib import Path
from datetime import datetime


class ProjectCodeAggregator:
    def __init__(self, root_dir, output_file, exclude_dirs=None, include_patterns=None, exclude_patterns=None, target_folder=None):
        self.root_dir = Path(root_dir).resolve()
        self.output_file = Path(output_file)
        self.exclude_dirs = set(exclude_dirs or [])
        self.include_patterns = include_patterns or ['*']
        self.exclude_patterns = exclude_patterns or []
        self.target_folder = target_folder
        
        # Common exclusion patterns
        self.exclude_dirs.update([
            '.git', '__pycache__', 'node_modules', 'target', 'build',
            'dist', '.vscode', '.idea', 'venv', 'env', '.env',
            'coverage', '.pytest_cache', '.mvn', 'bin', 'obj',' project_aggregator'
        ])
        
        # Common binary/file patterns to exclude
        self.exclude_patterns.extend([
            '*.pyc', '*.class', '*.jar', '*.war', '*.ear', '*.zip',
            '*.tar', '*.gz', '*.png', '*.jpg', '*.jpeg', '*.gif',
            '*.ico', '*.pdf', '*.doc', '*.docx', '*.xls', '*.xlsx',
            '*.pptx', '*.so', '*.dll', '*.exe', '*.dylib', '*.o',
            '*.a', '*.lib', 'package-lock.json', 'yarn.lock',
            '*.min.js', '*.min.css', '*.log', '*.tmp', '*.temp'
        ])

    def should_include_file(self, file_path):
        """Check if a file should be included based on patterns"""
        relative_path = file_path.relative_to(self.root_dir)
        
        # If target_folder is specified, only include files from that folder
        if self.target_folder:
            target_path = Path(self.target_folder)
            try:
                # Check if file is within the target folder
                relative_to_target = file_path.relative_to(self.root_dir / target_path)
            except ValueError:
                # File is not within the target folder
                return False
        
        # Check if in excluded directory
        for part in relative_path.parts:
            if part in self.exclude_dirs:
                return False
        
        # Check against exclude patterns
        for pattern in self.exclude_patterns:
            if fnmatch.fnmatch(file_path.name, pattern):
                return False
        
        # Check against include patterns
        for pattern in self.include_patterns:
            if fnmatch.fnmatch(file_path.name, pattern):
                # Exclude the project_aggregator.py file itself
                if file_path.name == 'project_aggregator.py':
                    return False
                return True
        
        return False

    def get_file_language(self, file_path):
        """Determine programming language from file extension"""
        extension_map = {
            # Java/Spring
            '.java': 'java',
            '.xml': 'xml',  # Maven configs
            '.properties': 'properties',
            '.yml': 'yaml',
            '.yaml': 'yaml',
            
            # TypeScript/React
            '.ts': 'typescript',
            '.tsx': 'typescript',
            '.js': 'javascript',
            '.jsx': 'javascript',
            
            # Python
            '.py': 'python',
            
            # Web
            '.html': 'html',
            '.css': 'css',
            '.scss': 'scss',
            '.sass': 'sass',
            
            # Config files
            '.json': 'json',
            '.md': 'markdown',
            '.txt': 'text',
            '.sql': 'sql',
            '.sh': 'bash',
            '.dockerfile': 'dockerfile',
            '.yml': 'yaml',
            '.yaml': 'yaml',
            
            # Shell scripts
            '.bat': 'batch',
            '.ps1': 'powershell',
        }
        
        # Handle dockerfile.dev and similar extensions
        if file_path.name.lower().startswith('dockerfile'):
            return 'dockerfile'
        
        ext = file_path.suffix.lower()
        return extension_map.get(ext, 'text')

    def format_file_size(self, size_bytes):
        """Format file size in human readable format"""
        for unit in ['B', 'KB', 'MB', 'GB']:
            if size_bytes < 1024.0:
                return f"{size_bytes:.1f} {unit}"
            size_bytes /= 1024.0
        return f"{size_bytes:.1f} TB"

    def read_file_content(self, file_path):
        """Read file content with proper encoding handling"""
        try:
            with open(file_path, 'r', encoding='utf-8') as f:
                return f.read()
        except UnicodeDecodeError:
            try:
                with open(file_path, 'r', encoding='latin-1') as f:
                    return f.read()
            except Exception as e:
                return f"# Error reading file: {e}\n# File appears to be binary or has unsupported encoding\n"
        except Exception as e:
            return f"# Error reading file: {e}\n"

    def generate_project_structure(self):
        """Generate a tree-like structure of the project"""
        structure = []
        
        def build_tree(dir_path, prefix=""):
            try:
                entries = sorted(os.listdir(dir_path))
                for index, entry in enumerate(entries):
                    full_path = os.path.join(dir_path, entry)
                    is_last = index == len(entries) - 1
                    
                    if os.path.isdir(full_path):
                        dir_name = os.path.basename(full_path)
                        if dir_name in self.exclude_dirs:
                            continue
                            
                        structure.append(f"{prefix}{'└── ' if is_last else '├── '}📁 {dir_name}/")
                        new_prefix = prefix + ("    " if is_last else "│   ")
                        build_tree(full_path, new_prefix)
                    else:
                        file_name = os.path.basename(full_path)
                        if self.should_include_file(Path(full_path)):
                            structure.append(f"{prefix}{'└── ' if is_last else '├── '}📄 {file_name}")
            except PermissionError:
                structure.append(f"{prefix}└── [Permission Denied]")

        structure.append("📁 Project Structure:")
        structure.append("├── 📁 " + os.path.basename(self.root_dir) + "/")
        build_tree(self.root_dir, "│   ")
        return "\n".join(structure)

    def generate_markdown(self):
        """Generate the complete markdown file"""
        print(f"Scanning project: {self.root_dir}")
        if self.target_folder:
            print(f"Target folder: {self.target_folder}")
        
        # Find all files to include
        source_files = []
        total_size = 0
        
        for root, dirs, files in os.walk(self.root_dir):
            # Remove excluded directories from walk
            dirs[:] = [d for d in dirs if d not in self.exclude_dirs]
            
            for file in files:
                file_path = Path(root) / file
                if self.should_include_file(file_path):
                    try:
                        file_size = file_path.stat().st_size
                        total_size += file_size
                        source_files.append((file_path, file_size))
                    except OSError:
                        continue
        
        # Sort files by path for consistent ordering
        source_files.sort(key=lambda x: str(x[0]))
        
        print(f"Found {len(source_files)} files ({self.format_file_size(total_size)})")
        
        # Generate markdown content
        markdown_content = [
            "# Project Source Code Documentation",
            "",
            f"**Generated on:** {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}",
            f"**Project Root:** `{self.root_dir}`",
        ]
        
        if self.target_folder:
            markdown_content.append(f"**Target Folder:** `{self.target_folder}`")
            
        markdown_content.extend([
            f"**Total Files:** {len(source_files)}",
            f"**Total Size:** {self.format_file_size(total_size)}",
            "",
            "---",
            "",
            self.generate_project_structure(),
            "",
            "---",
            "",
            "# Source Files",
            ""
        ])
        
        # Add each file's content
        for file_path, file_size in source_files:
            relative_path = file_path.relative_to(self.root_dir)
            language = self.get_file_language(file_path)
            
            markdown_content.extend([
                f"## 📄 `{relative_path}`",
                f"* **Size:** {self.format_file_size(file_size)}",
                f"* **Language:** {language}",
                "",
                f"```{language}",
                self.read_file_content(file_path),
                "```",
                "",
                "---",
                ""
            ])
        
        # Write to output file
        with open(self.output_file, 'w', encoding='utf-8') as f:
            f.write('\n'.join(markdown_content))
        
        print(f"Generated: {self.output_file}")

def get_user_choice():
    """Ask user if they want full project or specific folder documentation"""
    print("\n" + "="*50)
    print("Project Documentation Generator")
    print("="*50)
    print("1. Full project documentation (frontend + backend + etc)")
    print("2. Specific folder documentation (e.g., only frontend or only backend)")
    print("="*50)
    
    while True:
        choice = input("\nEnter your choice (1 or 2): ").strip()
        if choice == '1':
            return None
        elif choice == '2':
            folder = input("Enter the folder name (e.g., 'frontend', 'backend', 'src'): ").strip()
            if folder:
                return folder
            else:
                print("Please enter a valid folder name.")
        else:
            print("Please enter 1 or 2.")

def main():
    parser = argparse.ArgumentParser(description='Generate a single Markdown file with all project source code')
    parser.add_argument('root_dir', nargs='?', default='.', help='Project root directory (default: current directory)')
    parser.add_argument('-o', '--output', default='PROJECT_SOURCE_CODE.md', help='Output markdown file name')
    parser.add_argument('--include', nargs='+', help='File patterns to include (e.g., "*.java" "*.ts")')
    parser.add_argument('--exclude', nargs='+', help='Additional file patterns to exclude')
    parser.add_argument('--folder', help='Specific folder to document (e.g., "frontend", "backend")')
    
    args = parser.parse_args()
    
    # If folder is not provided as argument, ask the user
    target_folder = args.folder
    if target_folder is None:
        target_folder = get_user_choice()
    
    # Set default include patterns if not provided
    include_patterns = args.include or [
        '*.java', '*.xml', '*.properties', '*.yml', '*.yaml',  # Java/Spring
        '*.ts', '*.tsx', '*.js', '*.jsx',  # TypeScript/React
        '*.py',  # Python
        '*.html', '*.css', '*.scss', '*.sass',  # Web
        '*.json', '*.md', '*.txt', '*.sql', '*.sh',  # Config
        'Dockerfile', '*.dockerfile', 'dockerfile.*', 'docker-compose*.yml',  # Docker (now includes dockerfile.*)
        'pom.xml', 'build.gradle', 'package.json', 'tsconfig.json',  # Build configs
        '*.config.js', '*.config.ts', 'vite.config.*', 'webpack.config.*',  # Build tools
    ]
    
    aggregator = ProjectCodeAggregator(
        root_dir=args.root_dir,
        output_file=args.output,
        include_patterns=include_patterns,
        exclude_patterns=args.exclude or [],
        target_folder=target_folder
    )
    
    aggregator.generate_markdown()

if __name__ == "__main__":
    main()