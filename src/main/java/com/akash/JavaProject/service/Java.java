package com.akash.JavaProject.service;

import com.akash.JavaProject.service.easy.ELevel;
import com.akash.JavaProject.service.easy.ELevalImpl;
import com.akash.JavaProject.service.hard.HLevel;
import com.akash.JavaProject.service.hard.HLImpl;
import com.akash.JavaProject.service.medium.MLevel;
import com.akash.JavaProject.service.medium.MediumImpl;

import java.util.*;

public class Java {
    private int[] ints = {2, 7};
    private int[] ints1 = {1, 3, 0, 0};
    private String str1[] = {"A", "E", "I"};
    private String str2[] = {"O", "U"};

    public int[] getInts1() {
        return ints1;
    }

    private String string = "       Hello world        ";

    private int anInt;

    public int[] getInts() {
        return ints;
    }

    public int getAnInt() {
        return anInt;
    }

    public String getString() {
        return string;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String[] getStr1() {
        return str1;
    }

    public String[] getStr2() {
        return str2;
    }

    public static void main(String[] args) {
        Java java = new Java();
        ELevel ELeval = new ELevalImpl();
        MLevel medium = new MediumImpl();
        HLevel hard = new HLImpl();

        List list = new LinkedList();
        list.add("hello");
        list.add(1);
        System.out.println(list.toString());

        int[] ints = ELeval.twoSum(java.getInts(), 9);
        System.out.println(ints[0] + "and" + ints[1]);
        System.out.println(ELeval.removeDuplicates(java.getInts()));
        System.out.println(ELeval.searchInsert(java.getInts(), 3));
        System.out.println(ELeval.lengthOfLastWord(java.getString()));
        ELeval.merge(java.getInts1(), 3, java.getInts(), 3);
        System.out.println(medium.reverse(23));
        System.out.println(hard.findMedianSortedArrays(java.getInts1(), java.getInts()));
        System.out.println(medium.myAtoi("a"));
    }

}
