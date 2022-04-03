package com.javastudy.main;

import com.javastudy.lesson12.Bus;

public class Main {

    public static void main(String[] args) {
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();
        Bus lastBus = new Bus();

        firstBus.name = "Первый автобус";
        firstBus.color = "Зелёный";
        firstBus.model = "50-местный";
        firstBus.busNumber = 4852;

        secondBus.name = "Второй автобус";
        secondBus.color = "Красный";
        secondBus.model = "100-местный";
        secondBus.busNumber = 7512;

        lastBus.name = "Третий автобус";
        lastBus.color = "Черный";
        lastBus.model = "150-местный";
        lastBus.busNumber = 5472;

        firstBus.showName();
        firstBus.showBusNumber();
        firstBus.showModel();
        firstBus.showColor();

        secondBus.showName();
        secondBus.showBusNumber();
        secondBus.showModel();
        secondBus.showColor();

        lastBus.showName();
        lastBus.showBusNumber();
        lastBus.showModel();
        lastBus.showColor();

    }
}
