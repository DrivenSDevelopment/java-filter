package com.driven.tutorial.servletfilter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Jordan on 8/15/2017.
 */
public class Log2Filter implements Filter {

    private String logFile;

    public Log2Filter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.logFile = filterConfig.getInitParameter("logFile");
        System.out.println("Log File " + logFile);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (this.logFile != null) {
            // Write log to file
            this.logToFile(this.logFile);
        }

        // Go to the next element (filter or target) in chain.
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }

    private void logToFile(String fileName) {

        // Write log to file
        System.out.println("Write log to file " + fileName);
    }
}
