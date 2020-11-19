package com.karthi.seleniumspring.kelvin.aop;

import com.karthi.seleniumspring.kelvin.annotations.TakeScreenshot;
import com.karthi.seleniumspring.kelvin.service.ScreenshotService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Aspect
public class ScreenshotAspect {

    @Autowired
    ScreenshotService screenshotService;

    @After("@annotation(takescreenshot)")
    public void after(TakeScreenshot takescreenshot) throws IOException {
        screenshotService.takeScreenShot();
    }
}
