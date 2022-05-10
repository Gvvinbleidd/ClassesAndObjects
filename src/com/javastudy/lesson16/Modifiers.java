package com.javastudy.lesson16;

public class Modifiers {    //private   default(доступен внутри данного пакета)   protected(применим только ко внутренним классам)   public
   public String name;
   String name2; //тут уже используется default
//   public Modifiers(){}
    private Modifiers(){}
    private class FirstClass {
            public String color;
    }

    private static void still(){

    }

    public static void foo(){
        Modifiers modifiers = new Modifiers();
        still();
    }

    protected class SecondClass{

    }


}
