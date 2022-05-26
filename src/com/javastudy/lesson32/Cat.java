package com.javastudy.lesson32;

import java.io.Serializable;

public class Cat implements Serializable {

    //private static final long serialVersionUID = 1L;
    private String name;
    //private Lapa lapa; если мы хотим сериализовать так, то class лапа должен тоже толжен реализовывать интерфейс Serializable
    //private static String a = "1"; - при сериализации ЗНАЧЕНИЕ поля static не сериализуются
    //private transient String b = "2"; - при сериализации ЗНАЧЕНИЕ поля transient не сериализуются

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
