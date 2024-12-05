package org.tnsif.capgemini.c2tc.collections;
import java.util.LinkedList;
import java.util.List;
 
public class LinkedListDemo
{
     public static void main(String[] args)
     {
      List<String> states=new LinkedList<>();
      states.add("Andhra Pradesh");
      states.add("Kerala");
      states.add("Karnataka");
      states.add("Tamilnadu");
      states.add("Andhra Pradesh");
      //access element
      System.out.println("States "+states.get(3));
      //modify an element
      states.set(3,"Maharastra");
      //remove an element
      states.remove("Kerala");
      //check if an element exists
      if(states.contains("Andhra Pradesh"));
      {
    	  System.out.println("Andhra Pradesh is there in the List");
      }
      //print all the elements
      for(String State:states)
      {
    	  System.out.println(State);
      }
      //get the size of the linked list
      System.out.println("No of States "+states.size());
      //clear all the elements
      states.clear();
      System.out.println("States after clear operation "+states);
	}

}
