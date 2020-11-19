package com.karthi.seleniumspring.alltests;

import com.karthi.seleniumspring.BaseSpringTestNG;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;

public class Csvtest  extends BaseSpringTestNG {

    @Value("classpath:data/testdata.csv")
    private Resource resource;

    @Test
    public void testCsv() throws IOException {
        Files.readAllLines(resource.getFile().toPath())
                .forEach(System.out::println);
    }
}
