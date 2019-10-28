package com.hdsf.base.example.pc.imp;

import com.hdsf.base.example.pc.type.CPU;

public class IntelCPU extends CPU {

    public IntelCPU(String name, int coreNum, double price) {
        super(name, coreNum, price);
    }

    @Override
    public void work() {
        System.err.println("this is IntelCPU working...");
    }
}
