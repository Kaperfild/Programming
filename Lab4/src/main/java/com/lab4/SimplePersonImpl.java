package com.lab4;

abstract class SimplePersonImpl extends PersonImpl implements SimplePerson {

    public SimplePersonImpl(String name, HeroType type) {
        super(name, type);
    }

    public abstract void move();

}
