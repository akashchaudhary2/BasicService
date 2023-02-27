package com.akash.basicService;

import com.akash.basicService.controller.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/akash")
public class BasicServiceApplication implements Controller {

    public static void main(String[] args) {
        SpringApplication.run(BasicServiceApplication.class, args);
    }

    @GetMapping
    @Override
    public String test() {
        return "test string";
    }

}
