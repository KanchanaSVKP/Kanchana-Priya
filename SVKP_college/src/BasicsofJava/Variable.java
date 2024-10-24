package BasicsofJava;

public class Variable {
	int m1=70;//Instance Variable
	void print()
	{
		String message="Hii";//local Variable
		System.out.println(message);
	}
		static String msg ="Today is Holiday";//Static variable
	
	public static void main(String[] args) {
		Variable obj=new Variable();
		System.out.println(obj.m1);
		obj.print();
		System.out.println(msg);
	}
}