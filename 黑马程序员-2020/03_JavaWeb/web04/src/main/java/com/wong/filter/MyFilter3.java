package com.wong.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 注解开发过滤器
 * <p>
 * 注解 @WebFilter
 */
@WebFilter(urlPatterns = "/*")
public class MyFilter3 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("注解过滤器 MyFilter3");
        chain.doFilter(request, response);
    }
    
    @Override
    public void destroy() {
    
    }
}
