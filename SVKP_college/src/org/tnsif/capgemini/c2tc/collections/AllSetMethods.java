package org.tnsif.capgemini.c2tc.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AllSetMethods 
{

	public static void main(String[] args) 
	{
	  Set<String> set=new HashSet<>();
	  //add elements to the set
	  set.add("Black");
	  set.add("Sky Blue");
	  set.add("Purple");
	  set.add("Green");
	  set.add("White");
	
	  //display the set
	  System.out.println("initial set "+set);
	   
	  //removing the element
	  set.remove("Pueple");
	  System.out.println("Set after removing Purple "+set);
	  
	  //checking if element present
	  boolean containscherry=set.contains("Black");
	  System.out.println("Set contains Cherry "+containscherry);
	  
	  //get the size of the set
	  int size=set.size();
	  System.out.println("Size of Set "+size);
	  
	  //check of the set is empty
	  boolean isEmpty=set.isEmpty();
	  System.out.println("Set is empty "+isEmpty);
	  
	  set.clear();
	  System.out.println("after clear operation "+set);
	     
	  set.add("Red");
	  set.add("Yellow");
	  
	  //iterating over the elements of the set
	  System.out.println("iterating over the element");
	  Iterator<String>iterator=set.iterator();
	  while(iterator.hasNext())
	  {
		  System.out.println(iterator.next());
	  }
	  
}

}
