import java.util.*;
public class Ignorvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the strings");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=new StringBuffer(str1).reverse().toString();
		System.out.println("the reversed string is    "+str2);
		String result=str2.replaceAll("[aeiouAeiou]","");
		System.out.println(result);
	}

}
