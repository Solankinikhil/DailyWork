package com.cts.training4;


import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class WriteIntoMultipleFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path1="C:\\Users\\seed\\Desktop\\cse.txt";
		String path2="C:\\Users\\seed\\Desktop\\it.txt";
		String path3="C:\\Users\\seed\\Desktop\\ec.txt";
		String path4="C:\\Users\\seed\\Desktop\\me.txt";
		
		
		FileInputStream fin1=new FileInputStream(path1);
		FileInputStream fin2=new FileInputStream(path2);
		FileInputStream fin3=new FileInputStream(path3);
		FileInputStream fin4=new FileInputStream(path4);
		
		
		Vector vector=new Vector();
		vector.add(fin1);
		vector.add(fin2);
		vector.add(fin3);
		vector.add(fin4);
		
		Enumeration en=vector.elements();
		
		
		SequenceInputStream sis=new SequenceInputStream(en);
		
		
		int i;
		while((i=sis.read())!=-1) {
			System.out.print((char)i);
		}
		
		
		
		
		
		
		/*FileOutputStream out1=new 	FileOutputStream(path1);
		FileOutputStream out2=new 	FileOutputStream(path2);
		FileOutputStream out3=new 	FileOutputStream(path3);
		FileOutputStream out4=new 	FileOutputStream(path4);
		
		
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		
		String data="This is the common data to be written in file";
		
		byte[] b=data.getBytes();
		
		bout.write(b);
		
		bout.writeTo(out1);
		bout.writeTo(out2);
		bout.writeTo(out3);
		bout.writeTo(out4);     */
		
		
		
		

	}

}
