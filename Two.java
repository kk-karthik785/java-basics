import java.util.Scanner;
class Two
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		int N = Math.abs(S.nextInt());
		int sum =0;
		while(N>0)
		{
			int num =N%10;
			if(num%2!=0)
				sum += num*num;
			N /=10;
		}
		System.out.print(sum);
	}
}