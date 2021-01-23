package com.lab4;

public class Enemy extends SimplePersonImpl {
    public Enemy() {
        super("Враг", HeroType.UNKNOWN);
    }

    public void move(){
        System.out.println("Словно " + getName() + " был матерчатый;");
    }
}
