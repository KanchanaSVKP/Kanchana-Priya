package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

import java.util.*;  
public class LambdaExpressionExample5
{  
    public static void main(String[] args)
    {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Kanchana");  
        list.add("Navya");  
        list.add("Mounika");  
        list.add("Likki");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  