package com.eaccid.spring.aop;

import org.springframework.stereotype.Component;

@Component("camera")
public class Camera implements PhotoSnapper{

    public Camera() {
        System.out.println("Hello from camera constructor");
    }

    public void snap() throws Exception{
        System.out.println("SNAP!");
//        throw new Exception("bye bye!");
    }

    public void snap(int exposure) {
        System.out.println("SNAP! Exposure: " + exposure);
    }

    public String snap(String name) {
        System.out.println("SNAP! Name: " + name);
        return name;
    }

    public void snapNighttime() {
        System.out.println("SNAP! Night mode");
    }

}
