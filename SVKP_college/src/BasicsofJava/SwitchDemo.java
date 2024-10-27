package BasicsofJava;

public class SwitchDemo
{
public static void main(String[] args)
{
	String day="Friday";
	switch(day)
	{
	case "Monday":
	case "monday":
		System.out.println("Attend the Meetings");
		break;
	case "Tuesday":
	case "tuesday":
		System.out.println("Work on project tasks");
		break;
	case "Wednesday":
	case "wednesday":
		System.out.println("Submit the progress report");
		break;

	case "Thursday":
	case "thursday":
		System.out.println("Client call and review");
		break;

	case "Friday":
	case "friday":
		System.out.println("Wrap up weekly task");
		break;
	
	case "Saturday":
	case "saturday":
	case "Sunday":
	case "sunday":
		System.out.println("Enjoy the weekend");
}	
}
}
