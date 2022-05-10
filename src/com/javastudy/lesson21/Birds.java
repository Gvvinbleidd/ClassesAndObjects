package com.javastudy.lesson21;

    //В Java запрещено множественное наследование, наследовать можно только от одного класса

public class Birds {
    private String name;
    private Wings wings;

    public Birds(String name) {
        this.name = name;
    }

    public void walk(){
        System.out.println("ko-ko-ko");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
