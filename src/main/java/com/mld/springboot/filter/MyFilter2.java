package com.mld.springboot.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 方式二 和@ServletComponentScan配合使用
 */
@WebFilter(filterName = "filter2", urlPatterns = "/filter2")
public class MyFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter 2....");
        chain.doFilter(request, response);
    }


    @Override
    public void destroy() {

    }
}
