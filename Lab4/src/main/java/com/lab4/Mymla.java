package com.lab4;

public class Mymla extends PersonImpl {
    public Mymla() {
        super("Мюмла", HeroType.LIVE);
    }

    public void amazed(){
        System.out.println(" - Что ты сделал? - поразилась " + getName() + ".");
    }
    public void interest(){
        System.out.println(" - Что вы тут натворили? - поинтересовалась она.");
    }
    public String laugh(){
        return "весело засмеялась";
    } // Вывод ander'а
    public String creep(){
        return "через дыру полезла";
    } // Вывод ander'а
}
