package org.tnsif.capgemini.c2tc.Arrays; 
public class ArrayDemo1 
{
	public static void main(String[] args)
	//static value
	//{
		//int nums[]= {2,4,6,8};
		//System.out.println(nums[1]);
          //  nums[1]=5;
          //  System.out.println(nums[1]);
	//}
    
	//Dynamic value
	{
		//using forEach loop
	int nums[]=new int[4];
	nums[0]=1;
	nums[1]=3;
	nums[2]=5;
	nums[3]=7;
	
	System.out.println(nums[0]);
	System.out.println(nums[1]);
	System.out.println(nums[2]);
	System.out.println(nums[3]);
	
	for(int i=0;i<=3;i++)
	{
		System.out.println(nums[i]);
	}
    }
}


