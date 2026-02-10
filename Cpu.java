//To explain input process output
interface Ifdemo1
{
	void keyboard();
	void mouse();
}
interface Ifdemo2
{
	void moniter();
	void printer();
}
class Cpu implements Ifdemo1,Ifdemo2
{
	public void keyboard()
	{
		System.out.print("Input device used to type");
	}
	public void mouse()
	{
		System.out.print("Input device used to access");
	}
	public void moniter()
	{
		System.out.print("output device that displays");
	}
	public void printer()
	{
		System.out.print("output device used to print text");
	}
	public static void main(String args[ ])
	{
		Cpu c = new Cpu();
		c.keyboard();
		c.mouse();
		c.moniter();
		c.printer();
	}
}