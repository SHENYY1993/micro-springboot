package com.khoa.micro;

import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RestController
@RequestMapping("/hello")
public class MicroApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, this is Micro Image";
    }

    @GetMapping("/world")
    public String world() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key","World is changing");
        return jsonObject.get("key").toString();
    }
}
