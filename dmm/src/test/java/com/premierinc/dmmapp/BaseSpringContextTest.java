package com.premierinc.dmmapp;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Properties;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = Application.class)
@WebAppConfiguration
@ActiveProfiles("local")
public abstract class BaseSpringContextTest extends AbstractTestNGSpringContextTests{
    static{
        Properties properties = System.getProperties();
        properties.put("HOSTNAME", "TEST");
    }
}
