package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;
interface Drawabled
{
	public void draw();
	
}
public class WithLambdaExpression 
{
public static void main(String[] args)
{
		int width=10;
		Drawabled d2=()->{
			System.out.println("Drawing  "+width);
		};
		d2.draw();
	}

}
