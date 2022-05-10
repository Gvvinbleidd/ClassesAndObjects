package com.javastudy.lesson11;

public class OperatorSwitchTest {
    int Fi = 10;
    final int a=1, b=4, c=7;

    public void foo(){
        switch (Fi){
            case a:
                System.out.println("1");
                break;
            case b:
                System.out.println("2");
                break;
            case c:
                System.out.println("3");
                break;
            default:
                System.out.println("Not Found");
        }
    }
}
