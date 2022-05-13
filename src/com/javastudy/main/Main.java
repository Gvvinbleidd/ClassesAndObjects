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
import com.javastudy.lesson22.Test;
import com.javastudy.lesson23.AK47;
import com.javastudy.lesson23.Weapon;
import com.javastudy.lesson24.Boeing737;
import com.javastudy.lesson24.Mi8;
import com.javastudy.lesson24.Test2;
import com.javastudy.lesson25.DollySheet;
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

        //lesson 22 - полиморфизм

        //статический полиморфизм: 2 метода с одинаковым названием, но разными принимаемыми значениями
        ostrich.walk();
        ostrich.walk(" Hello");

        //Динамический полиморфизм(и переопределение методов)

        ostrich.walk2();

        Birds ostrich3 = new Ostrich("Галя");
        Birds crow2 = new Crow("Валя");

        Test test = new Test();
        test.foo(ostrich);
        test.foo(crow2);

        //lesson 23 - abstract classes(абстрактные классы)
        // Weapon weapon = new Weapon(); нельзя создать объект абстрактного класса
        //но можно создать объект класса наследника

        Weapon ak47 = new AK47(); //только в данном случае будут не доступны методы нашего класса AK47, только если они не переопределены.
        AK47 ak47M = new AK47(); //тут методы класса доступны

        //lesson 24 - interface (Интерфейсы)
        Mi8 mi8 = new Mi8();
        Boeing737 boeing737 = new Boeing737();

        Test2 test2 = new Test2();
        test2.foo(mi8);
        test2.foo(boeing737);

        test2.foo2(mi8);

        //lesson 25 - клонирование объектов
        DollySheet dollySheet = new DollySheet();
        DollySheet dollySheet2 = foo(dollySheet);

        dollySheet.setName("Dolly");
        dollySheet2.setName("Sheet");

        System.out.println("\nУрок 25: ");
        System.out.println("Овечка " + dollySheet.getName());
        System.out.println("Клонированная овечка: " + dollySheet2.getName());

        //lesson26 - класс String и его методы
        String str1 = new String("Java");
        String str2 = "Java";
        String str3 = "Hot JavaHello";
        String str4 = " Обрезал пробеллы перед и после строки ";
        System.out.println("\nУрок 26: " + "\n" + "символ под индексом 0 = " + str1.charAt(0));
        System.out.println("\nДанный метод ввозвращает символ в кодировке Unicode по заданному индексу: \nсимвол a имеет номер = " + str1.codePointAt(1));
        System.out.println("\nМетод сравнения строк: если значение строк равно, то и результат будет равен 0.\nРезультат: " + str1.compareTo(str2));
        System.out.println("\nМетод сравнения строк без учета регистра букв: если значение строк равно, то и результат будет равен 0.\nРезультат: " + str1.compareToIgnoreCase(str2));
        System.out.println("\nМетод сложения(слияния) строк.\nРезультат: " + str1.concat(str2)); //тоже самое что str1+str2
        System.out.println("\nМетод сравнения объектов.\nРезультат: " + str1.equals(str2));
        System.out.println("\nМетод сравнения объектов без учета регистра.\nРезультат: " + str1.equalsIgnoreCase(str2));
        System.out.println("\nМетод возвращает хэш код нашего объекта.\nРезультат: " + str1.hashCode());
        System.out.println("\nМетод принимает переменную ch. Эта переменная в кодировке Unicode. Если код совпадает с каким-либо символом в данной строке, то возвращается индекс данного символа. Если такого символа нет в строке, то возвращается -1.\nРезультат: " + str1.indexOf(97));
        System.out.println("\nМетод возвращает true если длина строки равна 0.\nРезультат: " + str1.isEmpty());
        System.out.println("\nМетод возвращает число символовв нашей строки.\nРезультат: " + str1.length());
        System.out.println("\nМетод разделяющий строку на массив по элементам в месте regex(разделитель), в данном случае это пробел:");
        String [] strings = str3.split(" "); //regex - разделитель, по которому строка будет разделена на элементы массива

        for (String element: strings) {
            System.out.println(element);
        }

        System.out.println("\nМетод вырезает кусок строки по заданным индексам.\nРезультат: " + str3.substring(2,8));
        System.out.println("\nМетод преобразует строку в массив символов\nРезультат: ");
        char [] charArray = str1.toCharArray();
        for (char element: charArray) {
            System.out.println(element);
        }

        System.out.println("\nМетод приводит строку к нижнему регистру\nРезультат: " + str3.toLowerCase());
        System.out.println("\nМетод приводит строку к верхнему регистру\nРезультат: " + str3.toUpperCase());
        System.out.println("\nМетод обрезает пробеллы перед и после строки\nРезультат: " + str4.trim());

        String str5 = String.valueOf(65);
        System.out.println("\nСтатические методы класса String.\n\nМетод valueOf() - преобразует переменную заданного типа в строку. \nРезультат: " + str5);

        System.out.println();
        char[] chars1 = {'H','e','l','l','o',' ','!'};
        System.out.println("\nМетод принимает массив символов и преобразует их в строку\nРезультат: " + String.copyValueOf(chars1));

        //lesson27 - StringBuilder and StringBuffer
        String str6 = new String("Java");
        StringBuilder stringBuilder = new StringBuilder(20); //по умолчанию capacity(размер буфера) = 16 символов
        stringBuilder.ensureCapacity(30); //установление минимального гарантированного размера буфера
        System.out.println("\nУрок 27: StringBuilder и StringBuffer\n\nРазмер буфера StringBuilder.\nРезультат: " + stringBuilder.capacity());

        System.out.println("\nПример использования методов классов String и StringBuilder: ");
        System.out.println(str6.concat(" Hot")); //при использовании каждый раз создается новый объект и при этом объект класса String остается неименным
        System.out.println(str6);
        StringBuilder stringBuilder1 = new StringBuilder("Java");
        System.out.println(stringBuilder1.append(" Hot")); //объект изменяется
        System.out.println(stringBuilder1);

        stringBuilder1.setLength(15);
        System.out.println("\nДлинна буфера:\nРезультат: " + stringBuilder1.capacity());
        StringBuilder stringBuilder2 = new StringBuilder("Java");
        stringBuilder2.insert(1,"G");
        System.out.println("\nМетод ''вставить'': \nРезультат: " + stringBuilder2);

        System.out.println("\nУдаление символа по индексу.\nРезультат: " +stringBuilder2.deleteCharAt(3));

        System.out.println("\nМетод reverse - переворачивает строку задом наперед.\nРезультат: " + stringBuilder2.reverse());
    }

    //lesson 25 - клонирование
    public static DollySheet foo(DollySheet dollysheet2) {
        DollySheet sheet = null;
        try {
            sheet = (DollySheet) dollysheet2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheet;
    }
}
