//bank program using this keyword
class Bank2
{
	private int Accno;
	void GetAcc(int Accno)
	{
		this.Accno = Accno;
	}
	void PrintAcc()
	{
		System.out.print("Accno is :"+Accno);
	}
	public static void main(String args[ ])
	{
		Bank2 C1 = new Bank2();
		C1.GetAcc(1234);
		C1.PrintAcc();
	}
}