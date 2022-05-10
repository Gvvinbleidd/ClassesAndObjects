package com.javastudy.lesson11;

public class OperatorSwitch {
    final int VALUE = 2, firstValue = 1, secondValue = 2, thirdValue = 3;

    public void foo() {
        switch (VALUE) {
            case 25:
                System.out.println("25");
                break;
            case 42:
                System.out.println("42");
                break;
            case 43:
                System.out.println("48");
                break;
            case firstValue:
                System.out.println(firstValue);
                break;
            case secondValue:
                System.out.println(secondValue);
                break;
            case thirdValue:
                System.out.println(thirdValue);
                break;
            default:
                System.out.println("not found");
        }
    }

}
