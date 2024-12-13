package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;
interface Drawable
{
	public void Draw();
}
 class Test implements Drawable
{
int width=20;
	@Override
	public void Draw() {System.out.println(" Drawing :"+width);
	}
};
public class WithoutLambdaExpression
{
public static void main(String[] args) 
	{
		Drawable d=new Test();
		d.Draw();
	}
}
//19 lines of code