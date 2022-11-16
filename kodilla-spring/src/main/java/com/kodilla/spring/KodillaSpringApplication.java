package com.kodilla.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KodillaSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(KodillaSpringApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String bean: beanDefinitionNames) {
            System.out.println(bean);
        }
    }

}
