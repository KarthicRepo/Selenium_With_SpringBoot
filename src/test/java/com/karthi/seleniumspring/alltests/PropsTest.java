package com.karthi.seleniumspring.alltests;

import com.karthi.seleniumspring.BaseSpringTestNG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class PropsTest extends BaseSpringTestNG {

    @Autowired
    private ResourceLoader loader;


    @Test
    public void testProps() throws IOException {
        Properties properties=PropertiesLoaderUtils.loadProperties(loader.getResource("data/testdata.properties"));
        System.out.println(properties);
    }

}
