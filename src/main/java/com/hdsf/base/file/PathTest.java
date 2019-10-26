package com.hdsf.base.file;

import java.io.File;
import java.nio.file.*;

public class PathTest {

    public static void main(String[] args) {
        //获取path1
        Path path1 = FileSystems.getDefault().getPath("./temp", "aa.txt");
        System.err.println(path1.getNameCount());
        //获取path2
        File file = new File("./temp/aa.txt");
        Path path2 = file.toPath();
        //等于0说明相等
        System.err.println(path1.compareTo(path2));
        //获取path3,后面参数可接无限个
        Path path3 = Paths.get("./temp", "aa.txt");
        System.err.println(path3.toString());
        //合并两个path
        Path path4 = Paths.get("./temp");
        System.err.println(path4.resolve("aa.txt"));
        System.err.println("是否可读："+ Files.isReadable(path2));
    }
}
