import java.util.Scanner;

public class huntset5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int ch1=0;
		char ch2;
	for(int i=0;i<str.length();i++)
	{
		if(Character.isDigit(ch[i]))
		{
			ch1=Character.getNumericValue(ch[i]);
			ch2=str.charAt(i-1);

			for (int j = 0; j < ch1; j++) {
				System.out.print(ch2);
			}
		}
	}	
	}}

