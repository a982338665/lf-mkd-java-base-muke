package com.hdsf.base.file;


import java.io.File;
import java.io.IOException;

/**
 * 文件属性
 */
public class FileAttributeTest {

    public static void main(String[] args) {
        //创建单级目录
        File file1 = new File("./temp1");
        if (!file1.exists()) {
            file1.mkdir();
        }
        //删除目录
        file1.delete();
        //创建多级目录
        File file2 = new File("./temp2/fff/ww");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        //删除目录
        file2.delete();
        //创建文件:文件夹路径必须存在，否则报错
        File file3 = new File("./temp1/xx.txt");
        if (!file3.exists()) {
            try {
                boolean newFile = file3.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //删除文件
        file3.delete();
        System.err.println("是否为文件："+ file3.isFile());
        System.err.println("是否为目录："+ file3.isDirectory());
        System.err.println("name："+ file3.getName());
        System.err.println("parent："+ file3.getParent());
        System.err.println("path："+ file3.getPath());
        System.err.println("size："+ file3.length() + "bytes");
        System.err.println("Last modified time："+ file3.lastModified() + " ms" );

        System.err.println("列出目录下所有文件及文件夹，但是不包括子目录下的文件======================");
        File file = new File("./");
        File[] files = file.listFiles();
        for (File f:files
             ) {
            System.err.println(f.getPath());
        }
    }
}
