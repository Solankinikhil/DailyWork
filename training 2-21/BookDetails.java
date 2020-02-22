package com.cts.training4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class BookDetails {
	String bookname;
	String authorname;
	String price;
	char n;
	public void menu()
	{
		System.out.println("Select one of the two option provided :");
		System.out.println("1 Input the book details");
		System.out.println("2 Display the book details");
	}
	   public void inData(String path) throws IOException
	   {
		   InputStreamReader a =new InputStreamReader(System.in);
		   BufferedReader c=new BufferedReader(a);
		   System.out.println("Enter the book name = ");
		   bookname=c.readLine();
		   System.out.println("Enter  author's name = ");
		   authorname=c.readLine();
		   System.out.println("Enter the price = ");
		   price=c.readLine();
		
		   FileWriter out=new FileWriter(path,true);

		   out.write(bookname + "\t"+authorname+"\t"+price+"\r\n");
			out.close();
	   }
	   public void dispData(String path) throws IOException
	   {
		   File file = new File(path);
		   FileInputStream in=new FileInputStream(file);
		   int i;
			while((i=in.read()) !=-1)
			{
				System.out.print((char)i);
			}
	   }
	public static void main(String[] args) throws IOException
	{
		String path="C:\\Users\\seed\\Desktop\\Bookdetail2.txt";
		FileOutputStream out = new FileOutputStream(path, true);
		{
		int i;
		char n;
		BookDetails bd=new BookDetails();
		bd.menu();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter your choice :");
			i = sc.nextInt();
		switch(i)
		{
		case 1 :
		if(i==1)
		{
			bd.inData(path);
		}break;
		case 2:
		if(i==2)
		{
			bd.dispData(path);
		}break;
		default:
		{
			System.out.println("Wrong Input!Please enter again!");
		}
		}
		System.out.println("Do want to continue Y?N");
		bd.n = sc.next().charAt(0);
		}while (bd.n == 'Y');
		}
	}
}