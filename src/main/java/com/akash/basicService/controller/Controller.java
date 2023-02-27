package com.akash.basicService.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface Controller {
    @GetMapping
    String test();
}
