package org.tnsif.capgemini.c2tc.collections;
import java.util.List;
import java.util.Stack;

public class StackDemo 
{
    public static void main(String[] args) 
    {
	Stack<Integer> stack=new Stack<Integer>();
	//push operation:add the elements
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	//displaying the stack
	System.out.println("Stack after pushes "+stack);
	//top element viewing without removing it
	System.out.println("top element "+stack.peek());
	//pop operation :to remove an element
	System.out.println("pop operatioon "+stack.pop());
	System.out.println(stack);
	//checking if stack is empty
	System.out.println("Stack is empty "+stack.isEmpty());
	//Search
	int position=stack.search(2);
	if(position!=2)
	{
		System.out.println("Element found in "+position);
	}
	else
	{
		System.out.println("Element not found "+position);
	}
    }
}
