package com.javastudy.lesson12;

public class Bus {
    public String name;
    public String color;
    public String model;
    public short busNumber;

    public void showName(){
        System.out.println("\n" + name);
    }

    public void showColor(){
        System.out.println("Цвет: " + color);
    }

    public void showModel(){
        System.out.println("Модель: " + model);
    }

    public void showBusNumber(){
        System.out.println("Номер автобуса: " + busNumber);
    }

}
