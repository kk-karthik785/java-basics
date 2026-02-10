//interface example
interface Interface
{
	void wel();
	void come();
}
class Ifdemo implements Interface
{
	public void wel()
	{
		System.out.print("welcome method from interface");
	}
	public void come()
	{
		System.out.print("come to learn interface");
	}
	public static void main(String args[ ])
	{
		Ifdemo IE = new Ifdemo();
		IE.wel();
		IE.come();
	}
}