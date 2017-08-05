import java.util.Scanner;

public class hunter63 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int a=sc.nextInt();
		System.out.println("enter the array elemets");
		int b[]=new int[a];
		
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int j=0;j<a;j++)
		{
			int temp=0;
			for(int k=j+1;k<a;k++)
			{
			if(temp<b[k])
			{
			temp=b[k];
			break;
			}
		}
			b[j]=temp;
			System.out.println(b[j]);
			}
	}

}
