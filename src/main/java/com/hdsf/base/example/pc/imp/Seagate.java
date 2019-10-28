package com.hdsf.base.example.pc.imp;

import com.hdsf.base.example.pc.type.Disk;

public class Seagate extends Disk {

    public Seagate(String name, int coreNum, double price) {
        super(name, coreNum, price);
    }

    @Override
    public void work() {
        System.err.println("this is Seagate working...");
    }
}
