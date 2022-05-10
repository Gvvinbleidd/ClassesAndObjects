package com.javastudy.main;

import com.javastudy.lesson10.ControlOperators;
import com.javastudy.lesson11.OperatorSwitch;
import com.javastudy.lesson11.OperatorSwitchTest;
import com.javastudy.lesson12.LoopControl;
import com.javastudy.lesson13.ForLoop;
import com.javastudy.lesson14.MyArrays;
import com.javastudy.lesson15.Constructor;
import com.javastudy.lesson16.Modifiers;
import com.javastudy.lesson17.Bus2;
import com.javastudy.lesson18.StaticVariablesAndMethods;
import com.javastudy.lesson19.Encapsulation;
import com.javastudy.lesson20.Music;
import com.javastudy.lesson21.Birds;
import com.javastudy.lesson21.Crow;
import com.javastudy.lesson21.Ostrich;
import com.javastudy.lesson8.Bus;
import com.javastudy.lesson8.References;
import com.javastudy.lesson9.Operation;

public class Main {

    public static void main(String[] args) {
//        Bus firstBus = new Bus();
//        Bus secondBus = new Bus();
//        Bus lastBus = new Bus();
//
//        firstBus.name = "Первый автобус";
//        firstBus.color = "Зелёный";
//        firstBus.model = "50-местный";
//        firstBus.busNumber = 4852;
//
//        secondBus.name = "Второй автобус";
//        secondBus.color = "Красный";
//        secondBus.model = "100-местный";
//        secondBus.busNumber = 7512;
//
//        lastBus.name = "Третий автобус";
//        lastBus.color = "Черный";
//        lastBus.model = "150-местный";
//        lastBus.busNumber = 5472;
//
//        firstBus.showName();
//        firstBus.showBusNumber();
//        firstBus.showModel();
//        firstBus.showColor();
//
//        secondBus.showName();
//        secondBus.showBusNumber();
//        secondBus.showModel();
//        secondBus.showColor();
//
//        lastBus.showName();
//        lastBus.showBusNumber();
//        lastBus.showModel();
//        lastBus.showColor();
//
//        lastBus.showName();
//        lastBus.showBusNumber();
//        lastBus.showModel();
//        lastBus.showColor();

//        Operation op = new Operation();
//
//        op.foo();
//
//        ControlOperators co = new ControlOperators();
//        co.foo();
//
//        OperatorSwitch opsw = new OperatorSwitch();
//        opsw.foo();
//
//        OperatorSwitchTest opT = new OperatorSwitchTest();
//        opT.foo();

//        LoopControl lp = new LoopControl();
//        lp.foo();
//
//        ForLoop forLoop = new ForLoop();
//        forLoop.foo();

//            MyArrays arrays = new MyArrays();
//            arrays.foo2();
//
//            Constructor constructor = new Constructor();
//            constructor.foo();
//
//            Modifiers.foo();

        Bus2 bus2 = new Bus2();
        bus2.go();
        System.out.println(bus2.showKm());
        int km2 = 50;
        bus2.showKm2(km2);
        String km3 = "20km";
        String model = "BusAir";
        int spdNow2 = 26;
        bus2.showKm3(km3, model, spdNow2);


        StaticVariablesAndMethods s = new StaticVariablesAndMethods();
        StaticVariablesAndMethods s1 = new StaticVariablesAndMethods();
        StaticVariablesAndMethods s2 = new StaticVariablesAndMethods();

//        Обращение к переменной static таким образом - дурной тон разработчика!
//        s.variable = 5;
//        s1.variable = 6;
//
//        System.out.println(s.variable);
//        System.out.println(s1.variable);
//        System.out.println(s2.variable);

        StaticVariablesAndMethods.variable = 10;
        StaticVariablesAndMethods.foo();
        s.show();

        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setA(11);
        System.out.println(encapsulation.getA());
        System.out.println(encapsulation.showResult());

        //lesson 20 - enum
        Music mc = Music.CLASSIC;
        for (Music element: Music.values()) {
            System.out.println(element);
        }

        Music mc2 = Music.valueOf(Music.class,"ROCK");

        System.out.println("mc: " + mc);
        System.out.println("mc2: " + mc2);
        System.out.println(mc.ordinal());

        switch (mc) {
            case CLASSIC:
                System.out.println("Метод switch: Classic");
                break;
            case ROCK:
                System.out.println("Rock");
                break;
            case POP:
                System.out.println("Pop");
                break;
        }

        System.out.println("mc getter i: " + mc.getI());
        System.out.println("mc getter name: " + mc.getName());

        mc2.foo();

        // lesson 21 - наследование extends
        System.out.println("Урок 21: Наследование(extends)");

        Ostrich ostrich = new Ostrich("Иван");
        Crow crow = new Crow("Карлуша");

        ostrich.setName("Ostrich");

        Birds ostrich2 = new Ostrich("Серж"); // мы создаем страуса, но ссылка является типом Birds
        //методы страуса в этом случае будут отсутствовать

        ostrich.hideHead();
    }
}
