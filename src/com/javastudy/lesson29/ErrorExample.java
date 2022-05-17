package com.javastudy.lesson29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ErrorExample {

    private ABC abc;

    public void foo() {
        //System.out.println(1/0); - на 0 делить нельзя
//        int[] array = {1, 2, 3};
//        array[5] = 3; - длинна массива 3, а мы пытаемся вызвать 6 элемент

        try { // - попытайся в данном выражении поймать какую-то ошибку
            abc.show(); //не был создан объект и мы непонятно у чего вызываем метод show
        } catch (NullPointerException e) { //при возникновении ошибки создается объект e, к которому потом мы будем обращаться
            //System.out.println("Деление на ноль");
            System.err.println("\nБлок проверки ошибок! - создан на уроке в качестве примера");
        }

        try {
            abc.show();
            System.out.println(1/0);
        } catch (Exception a) {
            System.err.println("Блок проверки ошибок и проверки иерархии исключений");
        } //catch (ArithmeticException ex) {
          //ex.printStackTrace();  - можно использовать множественный try {} catch(){}
          // }
        finally { //данный блок выполняется в любом случае вне зависимости от того в какой строчке выскочило исключение
            //обычно сбразываются потоки и т.д.
        }

        //ошибки легкого типа можно обработать так:
        if(abc == null){
            System.out.println("Проверка ошибок: null POINTER");
        } else {
            abc.show();
        }
    }

    public void foo2() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("Хей");
    }
}
