package com.akash.basicService;

import com.akash.basicService.enums.Prime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.akash.basicService.service.Basic;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/akash")
@SpringBootApplication
public class BasicServiceApplication implements com.akash.basicService.controller.Basic {
    @Autowired
    Basic basic;

    public static void main(String[] args) {
        SpringApplication.run(BasicServiceApplication.class, args);
    }

    @GetMapping("/prime/{num}")
    @Override
    public Prime primeCheck(@PathVariable("num") String num) {
        return Optional.of(num)
                .map(I -> Integer.valueOf(num))
                .map(basic::primeCheck)
                .get();
    }

    @GetMapping("/allupto/{s}")
    @Override
    public List allUptoX(@PathVariable("s") String s) {
        return Optional.of(s)
                .map(i -> Integer.valueOf(s))
                .map(basic::allTypeUptoX)
                .get();
    }
}
