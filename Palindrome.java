package strings;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
System.out.println("enter the string");
Scanner s=new Scanner(System.in);
String str=new String();
str=s.next();
String reverse=new StringBuffer(str).reverse().toString();
if(str.equals(reverse))
{System.out.println("is palindrome");}
else
	{System.out.println("not a palindrome");}
}

	}

