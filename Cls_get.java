//To print a value constructer method single parameter data scanf assign
import java.util.Scanner;
class Cls_get
{
	Cls_get(int a)
	{
		System.out.print("a value is :"+a);
	}
	public static void main(String args[ ])
	{
		Scanner S = new Scanner(System.in);
		System.out.print("enter value");
		int a = S.nextInt();
		Cls_get Cg = new Cls_get(a);
	}
}