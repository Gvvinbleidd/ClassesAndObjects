package com.javastudy.lesson9;

public class Operation {
    int i=12, i2=4, i3=55, c, c1;
    Integer y=2, y2=4, y3=24, b;
    boolean bu = i3>=y3;
    String str2="ХЕЙ ", str3="ПАРНИШКА", str4;

    public void foo(){
        c = i+i2/y2;
        System.out.println(c);
        System.out.println(bu);
        str4 = str2 + str3;
        System.out.println(str4);
        i++;
        System.out.println(i);
        y+=y2;
        System.out.println(y);
    }
}
