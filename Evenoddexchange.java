import java.util.*;
public class Evenoddexchange {

public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char []ch=str.toCharArray();
		int l=str.length();
		char[]ch1=new char[l];
	    int a=0,b=1;
	    for(int i=0;i<l;i++)
	    {
	    	if(i%2==0)
	    	{
	    		ch1[b]=ch[i];
	    		b=b+2;
	    	}
	    	if(i%2!=0)
	    	{
	    		ch1[a]=ch[i];
	    		a=a+2;
	    	}
	    }
	    for(int j=0;j<l;j++)
	    {
	    	System.out.print(ch1[j]);
}
}
}
