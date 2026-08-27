package com.kirti.cicdexample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{

    /**
     * @return
     */
    @GetMapping
    public String sayHello(){
        return "Hello";
    }
}
