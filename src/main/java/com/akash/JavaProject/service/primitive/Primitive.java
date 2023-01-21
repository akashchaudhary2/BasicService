package com.akash.JavaProject.service.primitive;

public class Primitive {
    String string;
    int anInt;
    Long aLong;
    Double aDouble;

    public Primitive(String string) {
        this.string = string;
    }

    public Primitive(int anInt) {
        this.anInt = anInt;
    }

    public Primitive(Long aLong) {
        this.aLong = aLong;
    }

    public Primitive(Double aDouble) {
        this.aDouble = aDouble;
    }

    public Primitive() {

    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public Long getaLong() {
        return aLong;
    }

    public void setaLong(Long aLong) {
        this.aLong = aLong;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }
}
