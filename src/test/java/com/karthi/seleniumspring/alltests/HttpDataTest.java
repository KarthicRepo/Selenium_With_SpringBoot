package com.karthi.seleniumspring.alltests;

import com.karthi.seleniumspring.BaseSpringTestNG;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HttpDataTest extends BaseSpringTestNG {

    @Value("https://www.google.com")
    private Resource resource;

    @Test
    public void testCsv() throws IOException {
        System.out.println(new String(FileCopyUtils.copyToByteArray(resource.getInputStream()), StandardCharsets.UTF_8));
    }
}
