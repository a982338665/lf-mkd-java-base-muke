package com.hdsf.base.file.io;

import java.io.File ;
import java.io.FileInputStream ;  
import java.io.InputStream ;  
import java.util.zip.ZipEntry ;  
import java.util.zip.ZipOutputStream ;  
import java.io.FileOutputStream ;

/**
 * 单个文件压缩
 */
public class SingleFileZip{
    public static void main(String args[]) throws Exception{    
        File file = new File("c:/temp/abc.txt") ;  // 定义压缩文件
        File zipFile = new File("c:/temp/single2.zip") ;   // 定义压缩文件名称
        
        InputStream input = new FileInputStream(file) ; // 定义文件输入流
        ZipOutputStream zipOut = null ; // 申明压缩流
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile)) ;  
        zipOut.putNextEntry(new ZipEntry(file.getName())) ; //设置ZipEntry对象
        zipOut.setComment("single file zip") ;  // 设置注释
        
        // 压缩过程
        int temp = 0 ;  
        while((temp=input.read())!=-1){ //读取内容，等于-1代表读完
            zipOut.write(temp) ;    //压缩输出
        }  
        input.close() ; // 关闭输入流
        zipOut.close() ;    //关闭输出流
        
        System.out.println("single file zip done.");
    }  
}
