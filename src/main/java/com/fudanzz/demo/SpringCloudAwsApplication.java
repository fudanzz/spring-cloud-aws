package com.fudanzz.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudAwsApplication {

    @Value("${db.name}")
    private String dbName;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAwsApplication.class, args);
    }


    @RequestMapping(value="/",method = RequestMethod.GET)
    public String greeting() {

        return "hello world" +dbName;
    }

}
