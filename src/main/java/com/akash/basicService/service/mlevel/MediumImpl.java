package com.akash.basicService.service.mlevel;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class MediumImpl implements MLevel {

    @Override
    public void SetObjects() {
        Set set1 = new HashSet();
        Set set2 = new LinkedHashSet();
        SortedSet Set3 = new TreeSet();
        NavigableSet Set4 = new TreeSet();
    }

    @Override
    public void QueueObjects() {
        Queue queue1 = new PriorityQueue();
//        Queue queue2 = new ArrayBlockingQueue();
        Queue queue3 = new LinkedBlockingQueue();
    }

    @Override
    public int reverse(int x) {
//            boolean isNegative = false;
//            if (x < 0) {
//                isNegative = true;
//                x = -x;
//            }
        long rev = 0;
        int rem;
        while (x > 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
//                x /= 10;
            x = x / 10;
        }
        if (rev > Integer.MAX_VALUE) {
            return 0;
        }
//            else return (int) (isNegative ? -reverse : reverse);
        else return (int) rev;
    }

    @Override
    public int myAtoi(String s) {
        s = "  -1234 az   ";
        int result = 0;
        int i = 0;
        s=s.trim();
        char flag = '+';
        if (s.charAt(0) == '-') {
            i++;
            flag = '-';
        }
        if (s.charAt(0)=='+'){
            i++;
        }
        while (s.length() > i && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            result = result * 10 + (s.charAt(i) - '0');
            i++;
        }
        if(flag=='-'){
            result=-result;
        }
        if(result>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if (result<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return result;

    }

}
