class join demo extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		try
		{
			thread.sleep(500);
		}
		catch(exception e)
		{
			System.out.print(e);
		}
		System.out.print(I);
	}
	public static void main(String args[ ])
	{
		Join demoJ1=new Join demo();
		Join demoJ2=new Join demo();
		Join demoJ3=new Join demo();
		J1.start();
		try
		{
			J1.Join();
		}
		catch(exception e)
		{
			System.out.print(e);
		}
		J2.start();
		J3.start();
	}
}



















