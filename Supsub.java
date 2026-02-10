//To print super value
class Sup
{
	int a = 10;
}
class Supsub extends Sup
{
	public void sup_met()
	{
		System.out.print("Super value is :"+super.a);
	}
	public static void main(String args[ ])
	{
		Supsub Ss = new Supsub();
		Ss.sup_met();
	}
}