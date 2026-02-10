//to print java class method empty data scan assign
import.java.util.Scanner
class Clsmet
{
	void welcome()
	{
		Scanner S = new Scanner(System.in);
		System.out.print("enter value");
		int a = S.nextInt();
		System.out.print("a value is :"+a);
	}
	public static void main(String args[ ])
	{
		Clsmet Cm = new Clsmet();
		Cm.welcome();
	}
}