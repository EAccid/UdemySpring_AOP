package com.eaccid.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Camera camera = (Camera) context.getBean("camera");
        camera.snap();
        context.close();

    }
}
