package com.lab4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Homsa extends PersonImpl {

    private static Homsa instance;
    private Homsa()  {
        super("Хомса",HeroType.LIVE);
    }
    public static Homsa getInstance(){
        if (instance == null){
            instance = new Homsa();
        }
        return instance;
    }

    public void giveKnife(){
        System.out.println(getName() + " схватисля за меч;");
    }
    public void go(){
        System.out.println(getName() + " бросился в коридор;");
    }
    public void clopEye(){
        System.out.println(getName() + " заморгал;");
    }
    public void decide(){
        System.out.println(getName() + " решился открыть глаза;");
    }
    public void toSee(){
        System.out.println(getName() + " увидел, что меч пробил дыру, сквозь которую ");
    }
    public void cut(String name){
        System.out.println(getName() + " вонзил меч в " + name + ";");
    }
}
