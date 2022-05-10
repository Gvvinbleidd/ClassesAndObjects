package com.javastudy.lesson17;

public class Bus2 {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "D23HA6";
    public final int SERIAL_NUMBER_2 = 52149;

    public void go(){
        System.out.println("GO");
    }

    public Engine showKm(){
//        int km = 65;
//        String str = "70km";
//        return km;

        engine = new Engine();
        return engine;
    }

    public void showKm2(int km3){
        km3 = km3 + 2;
        System.out.println(km3);
    }

    public void showKm3(String km40, String model, int spdnow){
        System.out.println("модель автобуса: " + model);
        System.out.println("ограничение скорости движения: " + km40);
        System.out.println("Реальная скорость: " + spdnow);

    }
}
