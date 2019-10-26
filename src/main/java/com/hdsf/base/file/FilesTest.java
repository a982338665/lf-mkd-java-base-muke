package com.hdsf.base.file;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

/**
 * 文件操作
 */
public class FilesTest {

    public static void main(String[] args) {
        moveFile();
        fileAttributes();
        createDirectory();
    }

    /**
     * 移动
     */
    public static void moveFile(){
        //移动 ./temp/a.txt 到 ./temp/test/def.txt 重命名为def.txt ,若文件存在则覆盖
        Path path = Paths.get("./temp/a.txt");
        Path resolve = path.getParent().resolve("test/def.txt");
        try {
            System.err.println("文件大小："+Files.size(path));
            Files.move(path,resolve, StandardCopyOption.REPLACE_EXISTING);
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("文件移动错误："+e.getMessage());
        }
    }

    /**
     * 获取文件属性
     */
    public static void fileAttributes(){
        Path path = Paths.get("./");
        //是否为文件夹
        System.err.println(Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS));
        try{
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
            System.err.println(basicFileAttributes.isDirectory());
            System.err.println(new Date(basicFileAttributes.lastModifiedTime().toMillis()).toLocaleString());
        }catch(Exception e){

        }
    }

    /**
     * 创建文件
     */
    public static void createDirectory(){
        Path path = Paths.get("./temp/test");
        try{
            //创建文件夹
            if(Files.notExists(path)){
                Files.createDirectories(path);
                System.err.println("文件夹创建完成！");
            }else{
                System.err.println("文件夹已存在！");
            }
            Path resolve2 = path.resolve("a.txt");
            Path resolve1 = path.resolve("b.png");
            Path resolve = path.resolve("a.class");
            Path resolve3 = path.resolve("c.txt");
            Path resolve4 = path.resolve("d.txt");

//            Files.createFile(resolve);
//            Files.createFile(resolve1);
//            Files.createFile(resolve2);
//            Files.createFile(resolve3);
//            Files.createFile(resolve4);

            //不加条件遍历
            DirectoryStream<Path> paths = Files.newDirectoryStream(path);
            for (Path p :paths
                 ) {
                System.err.println(p.getFileName());
            }

            //带过滤条件的遍历
            DirectoryStream<Path> paths2 = Files.newDirectoryStream(path,"*.{java,txt}");
            for (Path p :paths2
            ) {
                System.err.println("过滤后：：："+p.getFileName());
            }



        }catch(Exception e){

        }
    }




}
