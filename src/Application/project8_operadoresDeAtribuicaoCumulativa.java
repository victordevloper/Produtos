package Application;

import java.util.Locale;
import java.util.Scanner;

public class project8_operadoresDeAtribuicaoCumulativa 
{
	public static void Executar()
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if(minutos > 100)
		{
			conta = conta + (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
		
		
		//operadores de atribuição acumulativa

		// A += B; mesmo que: A = A + B
		// A -= B; mesmo que: A = A - B
		// A *= B; mesmo que: A = A * B
		// A /= B; mesmo que: A = A / B
		// A %= B; mesmo que: A = A % B
		
	}
}
