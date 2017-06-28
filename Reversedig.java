package mathan;
import java.util.Scanner;
public class Reversedig {

	public static void main(String[] args) {
		int n[]=new int[5];
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the digit");
		int len=n.length;
		for(int i=0;i<=len;i++)
		{
			n[i]=s.nextInt();
			
		for( i=len-2;i>=1;i--)
		System.out.print(i);
		
		
		}

	}

}
