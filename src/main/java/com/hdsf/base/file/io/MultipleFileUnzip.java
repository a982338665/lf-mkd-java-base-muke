package com.hdsf.base.file.io;

import java.io.File ;
import java.io.OutputStream ;  
import java.io.InputStream ;  
import java.util.zip.ZipEntry ;  
import java.util.zip.ZipFile ;  
import java.util.zip.ZipInputStream ;  
import java.io.FileInputStream ;  
import java.io.FileOutputStream ;  
public class MultipleFileUnzip{  
    public static void main(String args[]) throws Exception{    
    	//����ѹ��zip�ļ�����Ҫ��zip�ļ��Ϲ�������������ȡ���ݵ�Java��
        File file = new File("c:/temp/multiple.zip") ;   // ����ѹ���ļ�����  
        File outFile = null ;   // ����ļ���ʱ��Ҫ���ļ��еĲ���  
        ZipFile zipFile = new ZipFile(file) ;   // ʵ����ZipFile����  
        ZipInputStream zipInput = null ;    // ����ѹ��������  
        
        //�����ѹ���ļ���
        OutputStream out = null ;   // ������������������ÿһ��ʵ������  
        InputStream input = null ;  // ��������������ȡÿһ��ZipEntry  
        ZipEntry entry = null ; // ÿһ��ѹ��ʵ��  
        zipInput = new ZipInputStream(new FileInputStream(file)) ;  // ʵ����ZIpInputStream 
        
        //����ѹ�����е��ļ�
        while((entry = zipInput.getNextEntry())!=null){ // �õ�һ��ѹ��ʵ��  
        	System.out.println("��ѹ��" + entry.getName() + "�ļ�") ;  
            outFile = new File("c:/temp/" + entry.getName()) ;   // ����������ļ�·��  
            if(!outFile.getParentFile().exists()){  // �������ļ��в����� 
                outFile.getParentFile().mkdirs() ;   
                // �����ļ��� ,���������ж༶�ļ��в�����,��ʹ��mkdirs()
                // ���ֻ�ǵ�����һ���ļ���,ʹ��mkdir()�ͺ���
            }  
            if(!outFile.exists()){  // �ж�����ļ��Ƿ����
            	if(entry.isDirectory())
            	{
            		outFile.mkdirs();
            		System.out.println("create directory...");
            	}
            	else
            	{
            		outFile.createNewFile() ;   // �����ļ�
            		System.out.println("create file...");
            	}                  
            }  
            if(!entry.isDirectory())
            {
            	input = zipFile.getInputStream(entry) ; // �õ�ÿһ��ʵ���������  
                out = new FileOutputStream(outFile) ;   // ʵ�����ļ������  
                int temp = 0 ;  
                while((temp=input.read())!=-1){  
                    out.write(temp) ;  
                }  
                input.close() ;     // �ر�������  
                out.close() ;   // �ر������  
            }
            
        }  
        input.close() ;  
    }  
}
