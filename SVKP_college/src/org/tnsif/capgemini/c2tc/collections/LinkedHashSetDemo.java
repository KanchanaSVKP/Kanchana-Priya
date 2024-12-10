package org.tnsif.capgemini.c2tc.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo 
{

	public static void main(String[] args) 
	{
		Set<String>set=new LinkedHashSet<>();
		set.add("Yellow");
		set.add("Black");
		set.add("White");
		set.add(null);
		System.out.println("LinkedHashSet "+set);
		
	}

}
