package com.mld.springboot.config;

import com.mld.springboot.filter.MyFilter;
import com.mld.springboot.listener.MyListener;
import com.mld.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyServerConfig {

    /**
     * 注册Servlet
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean<MyServlet> myServlet() {
        return new ServletRegistrationBean<>(new MyServlet(), "/myServlet");
    }


    /**
     * 注册过滤器
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean<MyFilter> myFilter() {
        FilterRegistrationBean<MyFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/", "/myServlet"));
        return filterRegistrationBean;
    }

    /**
     * 注册监听器
     *
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean<MyListener> myListener() {
        return new ServletListenerRegistrationBean<>(new MyListener());

    }


}
