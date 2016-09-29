package com.eaccid.spring.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class Camera {



    @Pointcut //the method Logger.aboutToTakePhoto() advices this method
    public void snap() {
        System.out.println("SNAP!");
    }
}
