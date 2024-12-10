package org.tnsif.capgemini.c2tc.collections;
  import java.util.HashSet;
  import java.util.Set;
public class HashSetDemo 
{

	public static void main(String[] args)
	{
		Set<String> set=new HashSet<>();
		set.add("Red");
		set.add("yellow");
		set.add("orange");
		set.add("yellow");
		System.out.println("HashSet "+set);

	}

}
