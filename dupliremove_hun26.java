import java.util.Scanner;

public class dupliremove_hun26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String str1="";
		char[] s=str.toCharArray();
		for (int i = 0; i < s.length; i++)
		{
			if(!str1.contains(s[i]+""))
	   	{
				str1=str1+s[i];
		  }
		}System.out.println(str1);

	}

}
