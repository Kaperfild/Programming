package com.lab4;

abstract class PersonImpl implements Person {

    private String name;
    private HeroType type;

    public PersonImpl(String name, HeroType type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public HeroType getType() {return type;}

    @Override
    public String toString(){
        return "Person{ "
                + "Name = '" + name + "' "
                + "Type = '" + type + "' }";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        PersonImpl guest = (PersonImpl) obj;
        return name == guest.name && type == guest.getType();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this == null) ? 0 : name.length());
        return result;
    }
}

