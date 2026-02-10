//constructor method multi parameter data scan assign
import java.util.Scanner;
class Lion
{
	Lion(int a,int b)
	{
		System.out.print("a value is :"+a);
		System.out.print("b value is :"+b);
	}
	public static void main(String args[ ])
	{
		Scanner S = new Scanner(System.in);
		System.out.print("enter a value");
		int a = S.nextInt();
		System.out.print("enter b value");
		int b = S.nextInt();
		Lion L = new Lion(a,b);
	}
}
		