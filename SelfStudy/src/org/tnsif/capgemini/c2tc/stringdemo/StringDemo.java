package org.tnsif.capgemini.c2tc.stringdemo;

public class StringDemo
{

	public static void main(String[] args) 
	{
		String s1="Hello World ";
		String s2="HELLO WORLD ";
		String s3="Greetings ";
		String s4=new String("Greetings") ;
		String s5="Hello World ";
		if(s1==s5)
		{
			System.out.println("Refernce pointing to same object ");
		}
		else
		{
			System.out.println("Refernce pointing to different object");
		}
	}

}
