package BasicsofJava;

public class Increment_Decrement_Demo {

	public static void main(String[] args) {
	int a=16;
	//post increment
	System.out.println("a++  "+ a++);//print first then increment
	System.out.println("after post-increment a  "+a);//17
	//pre increment
	System.out.println("++a  "+  ++a);//increment first,then prints
	System.out.println("after pre-increment a  " +a);
	//post decrement
    System.out.println("a--  "+ a--);//print first then decrement
	System.out.println("after post-decrement a  "+a);
	//pre decrement
	System.out.println("--a   " + --a);//decrement first,then print
	System.out.println("after pre-decrement a" +a);
	

	}

}
