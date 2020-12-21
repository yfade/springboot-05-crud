package com.mld.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan   //Springboot启动时会扫描@WebServlet,@WebFilter,@WebListener注解，并将改类实例化
public class Springboot05CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot05CrudApplication.class, args);
    }

}
