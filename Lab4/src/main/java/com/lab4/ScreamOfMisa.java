package com.lab4;

public class ScreamOfMisa extends SimplePersonImpl {
    public ScreamOfMisa() {
        super("Крик Мисы", HeroType.NOTLIVE);
    }

    public void move() {
        System.out.println(getName() + " донёсся;");
    }
}
