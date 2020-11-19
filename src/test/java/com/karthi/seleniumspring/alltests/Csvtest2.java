package com.karthi.seleniumspring.alltests;

import com.karthi.seleniumspring.BaseSpringTestNG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.FileCopyUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Csvtest2 extends BaseSpringTestNG {

    @Value("classpath:data/testdata2.csv")
    private Resource resource;

    @Value("${screenshot.path}")
    private Path path;

    @Autowired
    private ResourceLoader resourceLoader;

    @Test(dataProvider = "getData")
    public void testCsv2(String url, String saveAs) throws IOException {
        FileCopyUtils.copy(resourceLoader.getResource(url).getInputStream(), Files.newOutputStream(path.resolve(saveAs)));
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return Files.readAllLines(resource.getFile().toPath())
                .stream()
                .map(s -> s.split(","))
                .toArray(Object[][]::new);

    }
}
