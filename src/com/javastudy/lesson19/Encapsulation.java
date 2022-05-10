package com.javastudy.lesson19;

public class Encapsulation {
    private int a, b;

    public int showResult(){
        return a+b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a; //this это потому что у нас переменные a, this указывает на переменную класса, что она равна переменной, которая пришла
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
