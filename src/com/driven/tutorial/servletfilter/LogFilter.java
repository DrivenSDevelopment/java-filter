package com.driven.tutorial.servletfilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Jordan on 8/15/2017.
 */
public class LogFilter implements Filter {

    public LogFilter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("LogFilter init!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;

        String servletPath = req.getServletPath();

        System.out.println("#INFO " + new Date()
                + " - ServletPath :" + servletPath + ", URL =" + req.getRequestURL());


        // Go to the next element (filter or target) in chain.
        // Allow the request to pass this filter to continue.
        // It can go to another Filter or to the requested user page.
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("LogFilter destroy!");
    }
}
