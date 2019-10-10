package com.hdsf.base;

public class DuoTaiA implements DuoTaiInterface {
    @Override
    public void eat() {
        System.err.println("A - eat ...");
    }

    @Override
    public void sleep() {
        System.err.println("A - sleep ...");
    }
}
