class joindemo extends Thread
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
		Joindemo J1=new Joindemo();
		Joindemo J2=new Joindemo();
		Joindemo J3=new Joindemo();
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



















