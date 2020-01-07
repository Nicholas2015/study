package com.nicholas.segmentfaultspringboot.lesson5.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerImpl implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        ClassLoader loader = servletContext.getClassLoader();

        while (true){

        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
