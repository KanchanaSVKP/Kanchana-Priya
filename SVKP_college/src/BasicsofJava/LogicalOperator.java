package BasicsofJava;

public class LogicalOperator
{

	public static void main(String[] args) 
	{
		int a=13,b=8,c=26;
		//Logical AND
		System.out.println("(a<b) && (b>c)"+ ((a<b) && (b>c)));
		//Logical OR
		System.out.println("(a>b) || (b<c)" +((a>b) ||  (b<c) ));
		// Logical Not
		System.out.println("!(a>b)"+(a>b));
	}
}
