package com.example.misc;

public class Overloading {



    public void m1(int s){
        System.out.println("object");
    }
    public void m1(String s){
        System.out.println("string");
    }

    public static void main(String args[]){
        Overloading overloading=new Overloading();
        overloading.m1(null);
    }
}
