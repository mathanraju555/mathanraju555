import java.util.Scanner;

public class player35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		String c="";
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
				c+=str.charAt(i)+"*";				
			else
				c+=Character.toString(str.charAt(i));
			}
		c+=str.charAt(str.length()-1);
		System.out.println(c);
		}

	}


