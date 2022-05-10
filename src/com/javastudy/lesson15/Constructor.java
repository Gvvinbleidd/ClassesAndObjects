package com.javastudy.lesson15;

public class Constructor {

    public void foo(){
        Flower flower = new Flower();
        flower.name = "Ромашка";
        flower.type = "обыкновенная";
        flower.color = "белая";

        Flower flower2 = new Flower("Роза", "обыкновенная", "красный");

        System.out.println(flower.name + " " + flower.type + " " + flower.color);
        System.out.println(flower2.name + " " + flower2.type + " " + flower2.color);

    }

}
