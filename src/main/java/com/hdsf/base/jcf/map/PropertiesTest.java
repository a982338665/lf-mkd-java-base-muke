package com.hdsf.base.jcf.map;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

//����Properties�ೣ�õĲ���
public class PropertiesTest {
    //����Key��ȡValue
    public static String GetValueByKey(String filePath, String key) {
        Properties pps = new Properties();
        try {
            InputStream in = new BufferedInputStream (new FileInputStream(filePath));  
            pps.load(in); //���е�K-V�Զ�������
            String value = pps.getProperty(key);
            //System.out.println(key + " = " + value);
            return value;
            
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    //��ȡProperties��ȫ����Ϣ
    public static void GetAllProperties(String filePath) throws IOException {
        Properties pps = new Properties();
        InputStream in = new BufferedInputStream(new FileInputStream(filePath));
        pps.load(in); //���е�K-V�Զ�������
        Enumeration en = pps.propertyNames(); //�õ������ļ�������
        
        while(en.hasMoreElements()) {
            String strKey = (String) en.nextElement();
            String strValue = pps.getProperty(strKey);
            //System.out.println(strKey + "=" + strValue);
        }
        
    }
    
    //д��Properties��Ϣ
    public static void WriteProperties (String filePath, String pKey, String pValue) throws IOException {
        File file = new File(filePath);
    	if(!file.exists())
    	{
    		file.createNewFile();
    	}
    	Properties pps = new Properties();
        
        InputStream in = new FileInputStream(filePath);
        //���������ж�ȡ�����б�����Ԫ�ضԣ� 
        pps.load(in);
        //���� Hashtable �ķ��� put��ʹ�� getProperty �����ṩ�����ԡ�  
        //ǿ��Ҫ��Ϊ���Եļ���ֵʹ���ַ���������ֵ�� Hashtable ���� put �Ľ����
        OutputStream out = new FileOutputStream(filePath);
        pps.setProperty(pKey, pValue);
        //���ʺ�ʹ�� load �������ص� Properties ���еĸ�ʽ��  
        //���� Properties ���е������б�����Ԫ�ضԣ�д�������  
        pps.store(out, "Update " + pKey + " name");
        out.close();
    }
    
    public static void main(String [] args) throws IOException{
    	System.out.println("д��Test.properties================");
        WriteProperties("Test.properties","name", "12345");
        
        System.out.println("����Test.properties================");
        GetAllProperties("Test.properties");
        
        System.out.println("��Test.properties����================");
        String value = GetValueByKey("Test.properties", "name");
        System.out.println("name is " + value);
    }
}
