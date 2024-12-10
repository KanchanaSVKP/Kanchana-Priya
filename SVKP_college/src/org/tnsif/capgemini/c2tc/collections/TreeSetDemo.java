package org.tnsif.capgemini.c2tc.collections;
import java.util.LinkedHashSet;
 import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
     Set<String> set=new TreeSet<>();
     set.add("Green");
     set.add("Black");
     set.add("White");
     set.add("Purple");
     System.out.println("TreeSet "+set);
		
	}

}
