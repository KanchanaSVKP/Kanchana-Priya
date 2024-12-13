package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

interface Sayabled{  
    public String say(String name);  
}  
public class LambdaExpressionExample3
{  
    public static void main(String[] args) {  
        // Lambda expression with single parameter.  
        Sayabled s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Priya"));    
        // You can omit function parenthesis    
        Sayabled s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Divya"));  
    }  
}  