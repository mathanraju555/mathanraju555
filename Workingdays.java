import java.util.Scanner;
public class Workingdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the day");
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		if((str.equalsIgnoreCase("monday"))||(str.equalsIgnoreCase("tuesday"))||(str.equalsIgnoreCase("wednesday"))||(str.equalsIgnoreCase("thursday"))||(str.equalsIgnoreCase("friday"))||(str.equalsIgnoreCase("saturday")))
		{
			System.out.println("true");
		}
		if(str.equalsIgnoreCase("sunday"))
		{
			System.out.println("false");
		}
	}

}
