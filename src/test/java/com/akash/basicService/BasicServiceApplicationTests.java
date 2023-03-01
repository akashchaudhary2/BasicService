package com.akash.basicService;

import com.akash.basicService.enums.Prime;
import com.akash.basicService.interfaces.StringsTest;
import com.akash.basicService.interfaces.numbersTests;
import com.akash.basicService.service.Basic;
import com.akash.basicService.service.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BasicServiceApplicationTests implements numbersTests, StringsTest {
    @Autowired
    Basic basic;
    @Autowired
    Strings strings;

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

    @Test
    @Override
    public void stringTest() {
        assertEquals(strings.lengthOfLastWord(" Hello world  "),5);
    }
    @Test
    @Override
    public void bookOwnedTest(){
        List list = Arrays.asList("1","2","3","100000");
        assertEquals(strings.bookOwned("1 2 3 100000"),list);
    }
}
