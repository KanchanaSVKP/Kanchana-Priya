package org.tnsif.capgemini.c2tc.collections;
import java.util.List;
import java.util.Vector;

public class VectorDemo1 
{
    public static void main(String[] args) 
	{
	List<Integer> numbers=new Vector<>();
	numbers.add(120);
	numbers.add(130);
	numbers.add(140);
	numbers.add(140);
	//access the element
	System.out.println("First number "+numbers.get(0));
	//modify the element
	numbers.set(3, 125);
	//remove the element
	numbers.remove(2);
	System.out.println(numbers);
	//check if exists
	if(numbers.contains(120))
	{
		System.out.println("120 is there in the List");
	}
	//print the elements
	for(Integer num:numbers)
	{
		System.out.println(num);
	}
	//size
	System.out.println("Size of Vector Data "+numbers.size());
	numbers.clear();
	System.out.println("List after clear Operation "+numbers);
	}

 }
