package com.eaccid.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("execution(void com.eaccid.spring.aop.Camera.snap())")
    public void cameraSnap() {
    }

    @Before("cameraSnap()") //method is called "advice"
    public void aboutToTakePhoto() {
        System.out.println("About to take photo...");
    }
}
