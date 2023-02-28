package com.akash.basicService.controller;

import com.akash.basicService.enums.Prime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface Basic {
    @GetMapping("/prime/{num}")
    Prime primeCheck(@PathVariable("num") String num);
    @GetMapping("/allupto/{s}")
    List allUptoX(@PathVariable("s") String s);
}
