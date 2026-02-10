//To print abstract method 
abstract class Phone
{
	abstract void whatsApp();
	void keypad()
	{
		System.out.print("keypad runs");
	}
}
class Ver1 extends Phone
{
	void whatsApp()
	{
		System.out.print("Whatsapp running");
	}
	public static void main(String args[ ])
	{
		Ver1 V1 = new Ver1();
		V1.keypad();
		V1.whatsApp();
	}
}