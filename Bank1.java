//bank program 
class Bank1
{
	private int Accno;
	void GetAcc(int Accno1)
	{
		Accno = Accno1;
	}
	void PrintAcc()
	{
		System.out.print("Accno is :"+Accno);
	}
	public static void main(String args[ ])
	{
		Bank1 C1 = new Bank1();
		C1.GetAcc(1234);
		C1.PrintAcc();
	}
}