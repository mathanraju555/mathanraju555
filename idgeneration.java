import java.util.Scanner;

public class idgeneration {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String nn1="";
	String nn2="";
	System.out.println("enter the first name");
	String f=sc.next();
	int l1=f.length();
	
	System.out.println("enter the last name");
	String n=sc.next();
	int l2=n.length();
	
	System.out.println("enter the pin");
	String p=sc.next();
	StringBuffer sb=new StringBuffer(p);
	String rev=sb.reverse().toString();
	
	System.out.println("enter the N");
	int num=sc.nextInt();
	
	char c;
	char pinid1;
	char pinid;
	String c1;
		int a=(int)(f.charAt(0));
		int b=(int)(n.charAt(0));
	if((l1>l2)||((l1==l2)&&(a>=b)))
		{
		c=f.charAt(0);
		c1=n;
		pinid=p.charAt(num-1);
		pinid1=rev.charAt(num-1);
		nn1=c+c1+pinid+pinid1;
		int l3=nn1.length();
		for (int i = 0; i <l3; i++)
		{
		if(Character.isUpperCase(nn1.charAt(i)))
			System.out.print(String.valueOf(nn1.charAt(i)).toLowerCase());
		else
				System.out.print(String.valueOf(nn1.charAt(i)).toUpperCase());
		}
		}
	else
		{
		pinid=p.charAt(num-1);
		pinid1=rev.charAt(num-1);
		c=n.charAt(0);
		c1=f;
		nn1=c1+c+pinid+pinid1;
		int l3=nn1.length();
		for (int i = 0; i <l3; i++)
		{
		if(Character.isUpperCase(nn1.charAt(i)))
			    System.out.print(String.valueOf(nn1.charAt(i)).toLowerCase());
		else
				System.out.print(String.valueOf(nn1.charAt(i)).toUpperCase());
		}
		}
		}
	}


