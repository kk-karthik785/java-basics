//To print college address
import java.util.Scanner;
class Clg_add
{
	public static void main(String args[ ])
	{
		Scanner S = new Scanner(System.in);
		System.out.print("enter college");
		String college = S.next();
		System.out.print("enter area");
		String area = S.next();
		System.out.print("enter road");
		String road = S.next();
		System.out.print("enter city");
		String city = S.next();
		System.out.print("dist");
		String dist = S.next();
		System.out.print("\ncollege is :"+college);
		System.out.print("\narea is :"+area);
		System.out.print("\nroad is :"+road);
		System.out.print("\ncity is :"+city);
		System.out.print("\ndist is :"+dist);
	}
}