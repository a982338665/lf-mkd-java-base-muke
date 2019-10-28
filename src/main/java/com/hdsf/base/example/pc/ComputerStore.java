package com.hdsf.base.example.pc;

import com.hdsf.base.example.pc.imp.IntelCPU;
import com.hdsf.base.example.pc.imp.Seagate;
import com.hdsf.base.example.pc.type.CPU;
import com.hdsf.base.example.pc.type.Disk;

/**
 * 主类
 */
public class ComputerStore {

    public static void main(String[] args) {
        CPU intel_cpu = new IntelCPU("intel cpu", 2, 1000);
        Disk disk = new Seagate("Seagate disk", 1000, 40960);
        //组装第一天机器
        Computer computer = new Computer("computer 1 ", intel_cpu, disk);
        System.err.println(computer.description());
        computer.work();

    }
}
