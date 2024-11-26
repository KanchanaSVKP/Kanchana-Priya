package org.tnsif.capgemini.c2tc.Static;

public class StaticVariable
{
    String name;
    double price;
    public static String category="Smart Phone";
    public StaticVariable(String name,double price)
    {
    this.name=name;
    this.price=price;
    }
    public void displayDetails()

    {
    	System.out.println("name "+name);
    	System.out.println("price "+price);
    	System.out.println("Category "+category);
    	System.out.println();
    }
	public static void main(String[] args)  
	{
		StaticVariable mobile1=new StaticVariable("Redmi ",15000);
		StaticVariable mobile2=new StaticVariable("Realme ",25000);
		System.out.println("MOBILE1 INFORMATION");
		mobile1.displayDetails();
		System.out.println("MOBILE2 INFORMATION");
		mobile2.displayDetails();
		
		}

}
