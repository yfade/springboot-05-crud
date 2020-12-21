package com.mld.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 方式二 和@ServletComponentScan配合使用
 */
@WebListener
public class MyListener2  implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("listener2 contextInitialized...");
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
