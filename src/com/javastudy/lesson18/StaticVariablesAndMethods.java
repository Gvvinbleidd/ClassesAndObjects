package com.javastudy.lesson18;

public class StaticVariablesAndMethods {
    public static int variable;  // static - значение будет общее для всех объектов
    public int variable2;

    static  {
        variable = 35;
    }

    public static void foo() {
        //System.out.println(variable2); - так использовать нельзя, т.к. будет обращение к переменной, а у всех объектов она может быть разная т.к. не static
        System.out.println(variable);
        //show(); - метод show должен быть static, чтобы к нему можно было обратиться
        //но наоборот обращаться можно, в нестатичном обратиться к статичному
    }

    public void show(){
        System.out.println("No");
        foo();
    }
}
