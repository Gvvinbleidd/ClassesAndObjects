package com.javastudy.lesson10;

public class ControlOperators {
    int a=5, b=7;
    boolean value = true;

    public void foo(){
        if(value){
            System.out.println("True");
            a++;
            if (a<b){
                System.out.println("YES");
            }
        } else if(b<a){
            System.out.println("False");
        } else {
            System.out.println("AAA");
        }

        if(value){
            System.out.println("Тест с переменной");
        }
    }
}
