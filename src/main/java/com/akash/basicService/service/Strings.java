package com.akash.basicService.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Strings {
    int lengthOfLastWord(String s);

    List bookOwned(String s1);
}
