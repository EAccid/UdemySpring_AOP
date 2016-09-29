package com.eaccid.spring.aop;

//class is called "Aspect"

public class Logger {

    //method is called "advice"

    public void aboutToTakePhoto() {
        System.out.println("About to take photo...");
    }
}
