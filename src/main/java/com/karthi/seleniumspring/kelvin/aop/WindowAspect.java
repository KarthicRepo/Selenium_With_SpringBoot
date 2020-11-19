package com.karthi.seleniumspring.kelvin.aop;

import com.karthi.seleniumspring.kelvin.annotations.Window;
import com.karthi.seleniumspring.kelvin.service.WindowSwitchService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WindowAspect {

    @Autowired
    private WindowSwitchService switchService;

    @Before("@target(window) && within(com.karthi.seleniumspring..*)")
    public void before(Window window){
        try {
            this.switchService.switchByTitle(window.value());
        }catch(Throwable e){System.out.println("Window was not found");}
    }

    @After("@target(window) && within(com.karthi.seleniumspring..*)")
    public void after(Window window){
        this.switchService.switchByIndex(0);
    }

}