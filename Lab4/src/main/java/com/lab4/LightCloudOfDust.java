package com.lab4;

public class LightCloudOfDust extends SimplePersonImpl {
    public LightCloudOfDust() {
        super("Лёгкое облако пыли", HeroType.NOTLIVE);
    }

    public void move() {
        System.out.println(getName() + " поднялось с полок;");
    }
}
