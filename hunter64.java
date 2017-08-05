import java.util.Scanner;

public class hunter64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the totel price");
		int p=sc.nextInt();
		int rupees[]=new int[5];
		int sum=0;
		rupees[0]=p/500;
		p=p%500;
		rupees[1]=p/100;
		p=p%100;
		rupees[2]=p/50;
		p=p%50;
		rupees[3]=p/10;
		p=p%10;
		rupees[4]=p/1;
		p=p%1;
		for (int j = 0; j <5; j++)
			sum+=rupees[j];
		System.out.println(sum);
	}

}
