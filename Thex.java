//to run thread
import java.lang.Thread;
class Thex extends Thread
{
	public void run()
	{
		System.out.print("Thread runs");
	}
	public static void main(String args[ ])
	{
		Thex Te = new Thex();
		Te.start();
	}
}