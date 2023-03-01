package com.akash.basicService.classes;


import com.akash.basicService.enums.Flag;
import com.akash.basicService.enums.Prime;
import com.akash.basicService.service.Basic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class numbers implements Basic {
    @Override
    public Prime primeCheck(Integer number) {
        String flag = "Green";
        if (number == 1 || number == 0) {
            return Prime.NotPrimeNumber;
        }
        if (number > 1) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    flag = "Red";
                    return Prime.NotPrimeNumber;
                }
            }
        }
        if (flag == "Green") {
            return Prime.PrimeNumber;
        }
        return Prime.NotPrimeNumber;
    }

    @Override
    public List allPrimeInRange(Integer x) {
        List list = new ArrayList();
        list.add(0,"prime numbers");
        int a = 1;
        int j = 2;
        Flag flag = Flag.Green;
        while (j <= x) {
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    flag = Flag.Red;
                }
            }
            if (flag == Flag.Green) {
                list.add(a, j);
                a++;
            }
            flag = Flag.Green;
            j++;
        }
        return list;
    }

    @Override
    public List evenUptoX(Integer x) {
        Flag flag = Flag.Red;
        List list = new ArrayList();
        list.add(0,"Even numbers");
        int j = 2;
        int i = 1;
        while (j <= x) {
            if (j % 2 == 0) {
                flag = Flag.Green;
            }
            if (flag == Flag.Green) {
                list.add(i, j);
                i++;
            }
            flag = Flag.Red;
            j++;
        }
        return list;
    }

    @Override
    public List oddUptoX(Integer x) {
        Flag flag = Flag.Red;
        List list = new ArrayList();
        list.add(0,"odd numbers");
        int j = 1;
        int i = 1;
        while (j <= x) {
            if (j % 2 != 0) {
                flag = Flag.Green;
            }
            if (flag == Flag.Green) {
                list.add(i, j);
                i++;
            }
            flag = Flag.Red;
            j++;
        }
        return list;
    }
    @Override
    public List allTypeUptoX(Integer integer){
        List<Integer> list1 =evenUptoX(integer);
        List<Integer> list2 =oddUptoX(integer);
        List<Integer> list3 = allPrimeInRange(integer);
        List<List<Integer>> list4 = Arrays.asList(list1,list2,list3);
        return list4.stream().flatMap(x->x.stream()).collect(Collectors.toList());
    }

}
