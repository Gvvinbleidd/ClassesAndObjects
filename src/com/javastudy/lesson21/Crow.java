package com.javastudy.lesson21;

public class Crow extends Birds{

    public Crow (String name){
        super(name);
    }

    public void fly() {
        System.out.println("I Crow and I fly");
    }

    @Override
    public void walk() {
        System.out.println("Я ВОРОНА");
    }
}
