package com.lab4;

public class TerribleNoise extends SimplePersonImpl {

    public TerribleNoise() {
        super("Страшный грохот", HeroType.NOTLIVE);
    }

    public void move() {
        System.out.println(getName() + " донёсся;");
    }
}
