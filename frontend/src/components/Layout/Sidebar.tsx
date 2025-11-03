import { NavLink } from 'react-router-dom'

const Sidebar = () => {
  const navigation = [
    { name: 'Dashboard', href: '/', icon: '📊' },
    { name: 'Accounts', href: '/accounts', icon: '🏦' },
    { name: 'Transactions', href: '/transactions', icon: '💰' },
    { name: 'Categories', href: '/categories', icon: '📁' },
    { name: 'Budgets', href: '/budgets', icon: '🎯' },
  ]

  return (
    <div className="w-64 bg-white shadow-lg">
      <nav className="mt-8 px-4">
        <ul className="space-y-2">
          {navigation.map((item) => (
            <li key={item.name}>
              <NavLink
                to={item.href}
                className={({ isActive }) =>
                  `flex items-center px-4 py-3 text-sm font-medium rounded-lg transition-colors ${
                    isActive
                      ? 'bg-primary-50 text-primary-700 border-r-2 border-primary-700'
                      : 'text-gray-700 hover:bg-gray-100'
                  }`
                }
              >
                <span className="mr-3 text-lg">{item.icon}</span>
                {item.name}
              </NavLink>
            </li>
          ))}
        </ul>
      </nav>
    </div>
  )
}

export default Sidebar