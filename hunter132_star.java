import java.util.Scanner;

public class hunter132_star {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int c=sc.nextInt();
		int x=0;
		for(int i=c;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
				System.out.print("*");
			
			for(int j=1;j<=x; j++)
                System.out.print(" ");
                 
            for(int j=i; j>=0; j--)
                System.out.print("*");
		
            System.out.println("");
		x=x+2;
		}

	}

}
