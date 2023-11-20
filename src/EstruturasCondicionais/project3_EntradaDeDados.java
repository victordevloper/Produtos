package EstruturasCondicionais;

import java.util.Scanner;

public class project3_EntradaDeDados 
{
	public static void Execute()
	{
		Scanner sc = new Scanner(System.in);
		
		
		//Para variaveis do tipo String usamos o "Next"
		String x;
		System.out.println("Digite uma palavra: ");
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		//Para variaveis do tipo int usamos o "NextInt, obs: double tbm aceita o nextint, mas podemos usar o NextDouble
		int y;
		System.out.println("Digite um numero: ");
		y = sc.nextInt();
		System.out.println("você digitou: " + y);
		
		sc.close();
	}
	
}
