import java.util.Scanner;
public class Isomorphicstring {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str1=new String();
		String str2=new String();
		int count1=0;
		str1=sc.next();
		str2=sc.next();
		char []c1=str1.toCharArray();
		char []c2=str2.toCharArray();
	if(str1.length()==str2.length())
		for(int i=0;i<str1.length();i++)
		{
		for(int j=i+1;j<str1.length();j++)
		{
			if((c1[i]==c1[j])&&(c2[i]==c2[j]))
			{
				count1=1;
			
			}
		}}
			if(count1==1)
			
				System.out.println("true");
			else 
			System.out.println("false");
			
			}}
				
		


