package org.tnsif.capgemini.c2tc.streamapi;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Arrays;

public class AllTerminalOperations
{

	public static void main(String[] args)
	{
		
		List<Integer> numbers=Arrays.asList(2,5,7,8,7,3,9,4);
		
		//ForEach 
		
		System.out.println("Numbers printed using ForEach");
		numbers.stream().forEach(n->System.out.print(n + " "));
		System.out.println();
		
		//toArray 
		
		Integer[] array=numbers.stream().toArray(Integer[]::new);
		System.out.println("Array" + Arrays.toString(array));
		
		//reduce 
		int sum1=numbers.stream().reduce(0, Integer::sum);
		System.out.println("sum of numbers " + sum1);
		
		//collect -collect to list after filtering
		List<Integer> uniquenumber=numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		
		
		//min 
		
		Optional<Integer> min1=numbers.stream().min(Integer::compareTo);
		min1.ifPresent(value->System.out.println("Minimun number " + value));
		
		// max 
		
		Optional<Integer> max1=numbers.stream().max(Integer::compareTo);
		max1.ifPresent(value->System.out.println("Maximum number " + value));
		
		//count 
		
		  long count =numbers.stream().count();
		  System.out.println("count of numbers " + count);
		
		  
		  //anymatch 
		  
		  boolean anygreaterthan=numbers.stream().anyMatch(n->n>8);
		 System.out.println("any number greater than 8 " + anygreaterthan);
		 
		 //allMatch 
		 
		 boolean allpositive =numbers.stream().allMatch(n->n>0);
		 System.out.println("No number are negative " +allpositive );
		 
		 //noneMatch 
		 
		 boolean nonnegative =numbers.stream().noneMatch(n->n<0);
		 System.out.println("no number are negative " +nonnegative);
		 
		 //findfirst 
		 
		 Optional<Integer> first=numbers.stream().findFirst();
		 first.ifPresent(value->System.out.println("first number " + value));
		 
		 Optional<Integer> any=numbers.stream().findAny();
		 any.ifPresent(value->System.out.println("any number " + value));
		 
		 
	}

}