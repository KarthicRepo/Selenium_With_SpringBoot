package com.karthi.seleniumspring.kelvin.service;

import com.github.javafaker.Faker;
import com.karthi.seleniumspring.kelvin.annotations.LazyConfiguration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

@LazyConfiguration
@Service   //can also be @Component
public class ScreenshotService {
	
	@Autowired
	private ApplicationContext ctx;
	
	@Value("${screenshot.path}")
	private Path screenPath;
	
	@Autowired
	private Faker faker;
	
	public void takeScreenShot() throws IOException {
		File sourceFile=ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
		FileCopyUtils.copy(sourceFile, screenPath.resolve(faker.funnyName().name()+".jpg").toFile());
		
	}

	public byte[] getScreenShot() throws IOException {
		return ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.BYTES);
	}

	//@PostConstruct
	public void init() {
		for(int i=0;i<10;i++) {
			System.out.println("waiting..."+i);
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
