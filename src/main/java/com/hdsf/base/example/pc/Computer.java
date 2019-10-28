package com.hdsf.base.example.pc;

import com.hdsf.base.example.pc.concept.Component;
import com.hdsf.base.example.pc.concept.Workable;
import com.hdsf.base.example.pc.type.CPU;
import com.hdsf.base.example.pc.type.Disk;

public class Computer extends Component implements Workable {

    private CPU cpu;
    private Disk disk;

    public Computer(String name,CPU cpu,Disk disk) {
        super(name, -1);
        this.cpu = cpu;
        this.disk = disk;;
        super.setPrice(cpu.getPrice()+disk.getPrice());
    }

    /**
     * 定义各部件的执行顺序
     */
    @Override
    public void work() {
        cpu.work();
        disk.work();

    }

    @Override
    public String description() {
        return cpu.description()+"|"+disk.description();
    }
}
