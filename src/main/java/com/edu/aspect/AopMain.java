package com.edu.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args) {

        final ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

    }
}
