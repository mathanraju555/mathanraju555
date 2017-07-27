import java.util.Scanner;

public class hunter33_keypad {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("null");
			break;
		case 2:
			System.out.println("ABC");
			break;
		case 3:
			System.out.println("DEF");
			break;
		case 4:
			System.out.println("GHI");
			break;
		case 5:
			System.out.println("JKL");
			break;
		case 6:
			System.out.println("MNO");
			break;
		case 7:
			System.out.println("PQRS");
			break;
		case 8:
			System.out.println("TUV");
			break;
		case 9:
			System.out.println("WXYZ");
			break;
		default:
			System.out.println("invalid key");
			break;
		}

	}

}
