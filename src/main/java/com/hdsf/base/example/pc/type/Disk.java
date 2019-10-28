package com.hdsf.base.example.pc.type;

import com.hdsf.base.example.pc.concept.Component;
import com.hdsf.base.example.pc.concept.Workable;

public abstract class Disk extends Component implements Workable {

    protected int volume;

    public Disk(String name, int volume,double price) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String description() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.description())
                .append("volume:{")
                .append(volume)
                .append("};");
        return stringBuilder.toString();
    }
}
