package com.eaccid.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Object obj = context.getBean("camera");
        System.out.println("Class of camera bean: " + obj.getClass());
        System.out.println(obj instanceof Camera);

        Camera camera = (Camera) context.getBean("camera");

        try {
            camera.snap();
        } catch (Exception e) {
            System.out.println("Cought exception " + e.getMessage());
        }

        context.close();

    }
}
