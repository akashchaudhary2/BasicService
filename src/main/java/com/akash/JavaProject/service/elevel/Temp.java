package com.akash.JavaProject.service.elevel;

public class Temp implements TempI{
    int anInt;
    public Temp(int i) {
        anInt=i;
    }

    @Override
    public void finalize() {
        System.out.println("finalize call");
    }

    @Override
    public int hashCode() {
        return anInt%9;
    }

    @Override
    public String toString() {
        return anInt+"";
    }
}
