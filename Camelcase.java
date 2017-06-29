import java.util.*;
public class Camelcase {
public static void main(String[] args) {
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int l=str.length();
	String[] ch=str.split(" ");
	for(String str1:ch)
	{
		System.out.print(Character.toUpperCase(str1.charAt(0))+str1.substring(1,str1.length()-1));
		
	}}	}
	


