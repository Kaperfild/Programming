package com.lab4;

public class Rustle extends SimplePersonImpl {
    public Rustle() {
        super("Шелест", HeroType.NOTLIVE);
    }

    public void move(){
        System.out.println(getName() + " раздался;");
    }
}
