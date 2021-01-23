package com.lab4;

public class DarkDarkness extends SimplePersonImpl {

    public DarkDarkness() {
        super("Кромешная тьма", HeroType.NOTLIVE);
    }

    public void move() {
        System.out.println(getName() + " стояла;");
    }
}
