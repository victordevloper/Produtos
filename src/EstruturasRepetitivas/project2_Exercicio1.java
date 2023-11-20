package EstruturasRepetitivas;

import java.util.Scanner;

public class project2_Exercicio1 
{
	public static void Executar()
	{
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while(senha != 2002)
		{
			System.out.println("Acesso Negado");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}
}
