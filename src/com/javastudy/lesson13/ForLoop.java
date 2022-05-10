package com.javastudy.lesson13;

public class ForLoop {

    int [] array = {1, 2, 3};

    public void foo() {
        for (int i=0; i<13; i++) {
            System.out.println(i);
        }

        System.out.println("\n");

        for (int element: array){
            System.out.println(element);
        }

        System.out.println("\n");

        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
}
