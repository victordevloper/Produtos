package OutrosTopicos;

import java.util.Scanner;

public class VerificandoBitwise 
{
	public static void Executar()
	{
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b0010000;
		int n = sc.nextInt();
		
		if((n & mask) != 0)
		{
			System.out.println("6th bit is true");
		}
		else
		{
			System.out.println("6th bit is false");
		}
	}
	
}
