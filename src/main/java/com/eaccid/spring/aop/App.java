package com.eaccid.spring.aop;

import com.eaccid.spring.camera.accessories.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Camera camera = (Camera) context.getBean("camera");
        Lens lens = (Lens) context.getBean("lens");

        camera.snap();
        camera.snap(1000);
        camera.snap("Prague castle");
        camera.snapNighttime();
        context.close();

       lens.zoom(5);

    }
}
