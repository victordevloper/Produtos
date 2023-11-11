package Application;

import java.util.Scanner;

public class project7_Atividade3 
{
	public static void Executar()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.printf(num + " é par");
		}
		else
		{
			System.out.printf(num + " é impar");
		}
	}
}
