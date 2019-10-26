package com.hdsf.base.file.io;//�ļ���ѹ��
import java.io.File ;
import java.io.FileInputStream ;
import java.io.InputStream ;
import java.util.zip.ZipEntry ;
import java.util.zip.ZipOutputStream ;
import java.io.FileOutputStream ;
public class MultipleFileZip{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		File file = new File("c:/temp/multiple") ;	// ����Ҫѹ�����ļ���
		File zipFile = new File("c:/temp/multiple2.zip") ;	// ����ѹ���ļ�����
		
		InputStream input = null ;	// �����ļ�������
		ZipOutputStream zipOut = null ;	// ����ѹ��������
		zipOut = new ZipOutputStream(new FileOutputStream(zipFile)) ;
		zipOut.setComment("multiple file zip") ;	// ����ע��
		
		//��ʼѹ��
		int temp = 0 ;
		if(file.isDirectory()){	// �ж��Ƿ����ļ���
			File lists[] = file.listFiles() ;	// �г�ȫ�����ļ�
			for(int i=0;i<lists.length;i++){
				input = new FileInputStream(lists[i]) ;	// �����ļ���������
				zipOut.putNextEntry(new ZipEntry(file.getName()
					+File.separator+lists[i].getName())) ;	// ����ZipEntry����
				System.out.println("����ѹ��" + lists[i].getName());
				while((temp=input.read())!=-1){	// ��ȡ����
					zipOut.write(temp) ;	// ѹ�����
				}
				input.close() ;	// �ر�������
			}
		}
		zipOut.close() ;	// �ر������
		System.out.println("multiple file zip done.");
	}
}
