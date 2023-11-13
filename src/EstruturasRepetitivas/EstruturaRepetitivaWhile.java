package EstruturasRepetitivas;

import java.util.Scanner;

public class EstruturaRepetitivaWhile 
{
	public static void Executar()
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		
		while(x != 0)
		{
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}
