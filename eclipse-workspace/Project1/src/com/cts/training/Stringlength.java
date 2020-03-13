package com.cts.training;

public class Stringlength {

	public static void main(String args[])
	{
	String msg="I am an engineer ";
	 System.out.println(msg.length());
	 String year= "of 2020";
	 System.out.println(msg.substring(0,8));
	 System.out.println(msg.charAt(5));
	 System.out.println(msg.codePointAt(7));
	 System.out.println(msg.codePointBefore(9));
	 System.out.println(msg.codePointCount(4, 8));
	 System.out.println(msg.compareTo(year));
	 System.out.println(msg.compareToIgnoreCase(msg));
	 System.out.println(msg.concat(year));
	 System.out.println(msg.contains(year));
	 System.out.println(msg.contentEquals(msg));
	 System.out.println(msg.endsWith(year));
	 System.out.println(msg.equals(year));
	 System.out.println(msg.equalsIgnoreCase(msg));
	 System.out.println(msg.hashCode());
	 System.out.println(msg.indexOf("e"));
	 
	 
}
}