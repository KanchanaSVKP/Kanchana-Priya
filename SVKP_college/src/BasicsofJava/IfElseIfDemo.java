package BasicsofJava;

public class IfElseIfDemo {
	public static void main(String[] args)
	{
		int Score=77;
		if(Score>90)
		{
			System.out.println("Grade A");
		}
		else if(Score>=80)
		{
			System.out.println("Grade B");
		}
		else if(Score>=70)
		{
			System.out.println("Grade C");
		}
		else if(Score>60)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
