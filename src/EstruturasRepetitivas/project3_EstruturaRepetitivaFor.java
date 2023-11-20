package EstruturasRepetitivas;

import java.util.Scanner;

public class project3_EstruturaRepetitivaFor 
{
	public static void Executar()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero que seja maior que 0: ");
		int num = sc.nextInt();
		
		for(int x = 0; x <= num; x++)
		{
			System.out.println("sequencial - " + x);
		}
	}
}
