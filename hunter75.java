import java.util.Scanner;

public class hunter75 {

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
		for (int i = 0; i <s-1; i++)
		{
		if(a[i]>a[i+1])
		{
			System.out.print(a[i+1]+" ");
		}
		else
			System.out.print(-1+" ");
		}
		System.out.print(-1);
	}

}
