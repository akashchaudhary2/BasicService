package com.akash.JavaProject.service;

import com.akash.JavaProject.service.easy.Easy;
import com.akash.JavaProject.service.easy.EasyImpl;

public class Java {
    private int[] ints = {2, 5, 6};
    private int[] ints1 = {1,2,3,0,0,0};

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

    public static void main(String[] args) {
        Java java = new Java();
        Easy easy = new EasyImpl();
        int[] ints = easy.twoSum(java.getInts(), 9);
        System.out.println(ints[0] + "and" + ints[1]);
        System.out.println(easy.removeDuplicates(java.getInts()));
        System.out.println(easy.searchInsert(java.getInts(), 3));
        System.out.println(easy.lengthOfLastWord(java.getString()));
        System.out.println("hoho");
        easy.merge(java.getInts1(), 3, java.getInts(), 3);

    }

}
