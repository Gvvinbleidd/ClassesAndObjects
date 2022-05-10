package com.javastudy.lesson21;

public class Ostrich extends Birds{

    public Ostrich(String name) {
        super(name);
    }

    public void hideHead(){
        System.out.println("I Ostrich and I scared");
        System.out.println(super.getWings());
    }
}
