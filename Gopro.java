//single inheritance class method empty statement model
class Goget
{
	void Goget_let()
	{
		System.out.print("a value is 10");
	}
}
class Gopro extends Goget
{
	void Gopro_let()
	{
		System.out.print("b value is 20");
	}
	public static void main(String args[ ])
	{
		Goget Gg = new Goget();
		Gopro Gp = new Gopro();
		Gg.Goget_let();
		Gp.Gopro_let();
		Gp.Goget_let();
	}
}