package com.lab4;

public class Something {

    public class SomethingBigAndSoft extends PersonImpl {

        public SomethingBigAndSoft() {
            super("Что-то большое и мягкое", HeroType.UNKNOWN);
        }

        public void move(Person person) {
            System.out.println(getName() + " хлестнуло " + person.getName() + " по лицу;");
        }
    }

    public class SomethingBigAndTerrible extends PersonImpl{
        public SomethingBigAndTerrible(){
            super("Что-то огромное и страшное-престрашное", HeroType.UNKNOWN);
        }

        public String fall(){
            return "с потолка обрушилось";
        }
    }

    SomethingBigAndSoft soft = new SomethingBigAndSoft();
    SomethingBigAndTerrible terrible = new SomethingBigAndTerrible();

    public void sSoftMove(Person person) {
        if (person == null){
            throw new AbsenceOfPersonException();
        }
        soft.move(person);
    }
    public String sTerribleFall(){
        return terrible.fall();
    }

    public String getNameS() {
        return soft.getName();
    }
    public String getNameT() {
        return terrible.getName();
    }
}
