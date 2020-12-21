package com.mld.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 方式一
 */
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("servlet init...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("servlet destroy...");
    }
}
