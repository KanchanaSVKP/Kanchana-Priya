package org.tnsif.capgemini.c2tc.stringdemo;

public class StringMethodsDemo
{
   public static void main(String[] args) 
	{
		String str="Hello,Priya";
		int l=str.length();
		System.out.println("length "+l);
		char c=str.charAt(6);
		System.out.println("Char at index 6 "+c);
		String s=str.substring(6);
		System.out.println(s);
		String s1=str.substring(2,4);
		System.out.println(s1);
		String s2=str.toLowerCase();
		System.out.println(s2);
		String s3=str.toUpperCase();
		System.out.println(s3);
		
	}

}
