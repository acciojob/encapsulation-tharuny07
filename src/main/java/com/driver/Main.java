package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();

//        obj.name="tharun";
//        System.out.println(name);
        obj.setName("Tharun");
        obj.getName();
    }
}