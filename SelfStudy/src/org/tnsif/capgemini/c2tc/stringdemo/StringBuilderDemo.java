package org.tnsif.capgemini.c2tc.stringdemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		{
			StringBuilder sb=new StringBuilder("Initial Value ");
			sb.append("Appended");
			sb.append("Again");
            sb.insert(12, "[insert]");
            sb.replace(26,27,"[replaced]");
            sb.delete(2,4);
            //sb.reverse
            System.out.println("Final StringBuilder result" +sb.toString());
		}
	}
	}

