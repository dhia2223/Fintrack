package com.fintrack.config;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RequestLoggingFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(RequestLoggingFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;

        logger.debug("=== REQUEST DEBUG ===");
        logger.debug("Method: {}", httpRequest.getMethod());
        logger.debug("Request URI: {}", httpRequest.getRequestURI());
        logger.debug("Context Path: {}", httpRequest.getContextPath());
        logger.debug("Servlet Path: {}", httpRequest.getServletPath());
        logger.debug("Path Info: {}", httpRequest.getPathInfo());
        logger.debug("=== END REQUEST DEBUG ===");

        chain.doFilter(request, response);
    }
}