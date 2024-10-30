package BasicsofJava;

public class Bitwise_Operator {

	public static void main(String[] args) {
		int a=7;
		int b=4;
		//bitwise AND operator
		System.out.println("(a&b): " +(a&b));
		//bitwise OR operator
		System.out.println("(a|b): " +(a|b));
		//bitwise XOR operator
		// The XOR operator (^) compare two bits
		//The result is 1 if the bits are different and 0 if the bits are the same
		System.out.println("(a^b): " +(a^b));
		//bitwise NOT operator
		//Inverts all bits result  depends on system
		System.out.println("(~a :"+(~a));
        //Left Shift
		System.out.println("(a<<3) :" +(a<<3));
		//Right Shift
		System.out.println("(a>>2)  :"+(a>>2));
	}

}
