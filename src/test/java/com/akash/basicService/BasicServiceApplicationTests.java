package com.akash.basicService;

import com.akash.basicService.enums.Prime;
import com.akash.basicService.service.Basic;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BasicServiceApplicationTests implements Class1Tests {
    @Autowired
    Basic basic;

    @Test
    @Override
    public void primeTest() {
        assertEquals(basic.primeCheck(3), Prime.PrimeNumber);
        assertEquals(basic.primeCheck(7), Prime.PrimeNumber);
        assertEquals(basic.primeCheck(47), Prime.PrimeNumber);
    }

    @Override
    @Test
    public void primeUptoXtest() {
        List list1 = Arrays.asList(2, 3, 5);
        assertEquals(basic.allPrimeInRange(5), list1);
        List list2 = Arrays.asList(2, 3, 5, 7, 11);
        assertEquals(basic.allPrimeInRange(12), list2);
    }

    @Test
    @Override
    public void evenUptoX() {
        List list = Arrays.asList(2, 4, 6, 8, 10);
        assertEquals(basic.evenUptoX(10), list);
    }

    @Test
    @Override
    public void oddUptoX() {
        List list = Arrays.asList(1, 3, 5, 7, 9);
        assertEquals(basic.oddUptoX(10), list);
    }
}
