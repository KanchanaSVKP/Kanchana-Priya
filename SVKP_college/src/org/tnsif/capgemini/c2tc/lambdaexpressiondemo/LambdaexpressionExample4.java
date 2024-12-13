package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

interface Addable
{  
    int add(int a,int b);  
}  
public class LambdaexpressionExample4
{  
    public static void main(String[] args) 
    {     
        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(120,45));     
       
        // Multiple parameters with data type in lambda expression  
        Addable ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(135,89));  
    }  
} 