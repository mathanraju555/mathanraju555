import java.util.Iterator;
import java.util.Scanner;

public class hunter324 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int s=sc.nextInt();
		System.out.println("enter the array");
		int a[]=new int[s];
		for(int i=0;i<s;i++)
		{
		a[i]=sc.nextInt();
		}
		System.out.println("enter the target");
		int t=sc.nextInt();
		for (int i = 0; i < a.length-1; i++) 
		{
		if(t==a[i]+a[i+1])
			System.out.println(a[i]+" "+a[i+1]);
		}

	}

}
