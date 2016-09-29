package com.eaccid.spring.aop;

public class Camera {

    //the method Logger.aboutToTakePhoto() advices this method

    public void snap() {
        System.out.println("SNAP!");
    }
}
