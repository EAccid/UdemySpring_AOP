package com.eaccid.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MachineAspect {

    @DeclareParents(value="com.eaccid.spring.aop.*", defaultImpl=com.eaccid.spring.aop.Machine.class)
    private IMachine machine;

    @Around("within(com.eaccid.spring.aop.*)")
    public void runMachine(ProceedingJoinPoint jp) {

        System.out.println("Running ...");
        try {
            jp.proceed();
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("... completed.");
    }
}