import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
int fact=1;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=1;i<a;i++)
{
fact=fact*i;	
}System.out.println("the factorial is:"+fact);
	}
}
