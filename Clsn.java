//To print a value constructor method single parameter data direct assign
class Go_get
{
	Go_get()
	{	
		System.out.print("a value is :"+a);
	}
	public static void main(String args[ ])
	{
		int a=10;
		Go_get C=new Go_get(a);
	}
}