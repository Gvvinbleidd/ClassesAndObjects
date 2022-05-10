package com.javastudy.lesson12;

public class LoopControl {

    boolean value = true;
    int a=5, b=7, c=3, d=8;

    public void foo() {
        do {
            a++;
            System.out.println(a);
        } while (a<b);

        while (c<=d){
            System.out.println(c);
            c++;
        }

        System.out.println("\n");
    }

}
