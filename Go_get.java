//To print a value constructor method empty data scan assign
import java.util.Scanner;
class Go_get
{
	Go_get()
	{
		Scanner S = new Scanner(System.in);
		System.out.print("enter a value");
		int a = S.nextInt();
		System.out.print("a value is :"+a);
	}
	public static void main(String args[ ])
	{
		Go_get Gg = new Go_get();
	}
}