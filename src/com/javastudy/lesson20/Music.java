package com.javastudy.lesson20;

public enum Music {
    CLASSIC(5, "classic"), ROCK(10, "rock"), POP(12, "pop");

    private int i;
    private String name;

    Music(int i, String name){
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    public void foo() {
        System.out.println("метод foo: " + Music.CLASSIC.getName());
    }
}
