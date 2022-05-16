package com.javastudy.lesson28;

public class Robot <T extends Head> {
    private Body body;
    private T head;

    public void foo(){
        //head + 1 - тоже не получится
        //head. - не можем так, т.к. не знаем какой у нас параметр будет
    }

    public <T1, T2 extends Head> T2 parametr(T1 a, T2 b){

        return b;
    }

    public void foo2(Robot<?> ob){

    }

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }


}
