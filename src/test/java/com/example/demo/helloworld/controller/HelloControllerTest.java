package com.example.demo.helloworld.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


// This test class is used to test the HelloController.But 
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {
    @Autowired
    private HelloController helloController;
    @Test
    public void sayHelloTest01() {
        Assert.assertEquals("Hello, World!", helloController.sayHello());
    }
}
