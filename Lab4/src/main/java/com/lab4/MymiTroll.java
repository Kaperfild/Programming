package com.lab4;

public class MymiTroll extends PersonImpl{
    public MymiTroll(){
        super("Муми-тролль", HeroType.LIVE);
    }

    public String scream() {
        return "закричал";
    }


    public static class Mom extends PersonImpl{
        public Mom(){
            super("Мама", HeroType.LIVE);
        }

        public String pull() {
            return "потянула за шнурок";
        }
    }
}
