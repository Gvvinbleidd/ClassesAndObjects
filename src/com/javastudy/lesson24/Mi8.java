package com.javastudy.lesson24;

public class Mi8 extends Helicopter implements VerticalTakeOff{

    @Override
    public void fly() {
        System.out.println("Helicopter Mi8");
    }

    @Override
    public void verticalTakeoff() {
        System.out.println("Helicopter Mi8 vertical");
    }
}
