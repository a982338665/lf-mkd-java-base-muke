package com.hdsf.base.example.pc.type;

import com.hdsf.base.example.pc.concept.Component;
import com.hdsf.base.example.pc.concept.Workable;

public abstract class CPU extends Component implements Workable {

    protected int coreNum;

    public CPU(String name,int coreNum, double price) {
        super(name, price);
        this.coreNum = coreNum;
    }

    @Override
    public String description() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.description())
                .append("size:{")
                .append(coreNum)
                .append("};");
        return stringBuilder.toString();
    }
}
