package com.javastudy.lesson21;

public class Ostrich extends Birds{

    public Ostrich(String name) {
        super(name);
    }

    public void hideHead(){
        System.out.println("I Ostrich and I scared");
        System.out.println(super.getWings());
    }

    public void walk(String str) {
        System.out.println("Ho-ho-ho" + str);
    }

    @Override  //переопределение методов
    public void walk2() {
        System.out.println("YaY");
    }
}
