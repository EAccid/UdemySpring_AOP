package com.eaccid.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("execution(void com.eaccid.spring.aop.Camera.snap(..))")
    public void cameraSnap() {
    }

    @Pointcut("execution(* com.eaccid.spring.aop.Camera.snap(String))")
    public void cameraSnapName() {
    }

    @Pointcut("execution(* *.*(..))") //any returned type, any package, any class name, any arg[]
    public void cameraDoesSmth() {
    }

    @Before("cameraSnap()") //method is called "advice"
    public void aboutToTakePhoto() {
        System.out.println("About to take photo...");
    }

    @Before("cameraSnapName()") //method is called "advice"
    public void aboutToTakePhotoWithName() {
        System.out.println("About to take photo with name...");
    }

    @Before("cameraDoesSmth()") //method is called "advice"
    public void aboutToCameraDoesSmth() {
        System.out.println("About to camera does smth...");
    }

}
