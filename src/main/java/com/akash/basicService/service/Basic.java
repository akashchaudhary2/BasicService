package com.akash.basicService.service;

import com.akash.basicService.enums.Prime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Basic {

    Prime primeCheck(Integer number);

    List allPrimeInRange(Integer x);

    List evenUptoX(Integer x);

    List oddUptoX(Integer x);

    List allTypeUptoX(Integer integer);
}
