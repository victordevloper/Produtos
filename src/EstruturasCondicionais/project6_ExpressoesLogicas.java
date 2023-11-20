package EstruturasCondicionais;

import java.util.Scanner;

public class project6_ExpressoesLogicas 
{
	public static void Executar()
	{
		String nome = "Victoria";
		
		if(nome == "Victor")
		{
			System.out.println("Olá Victor");
		}
		else
		{
			System.out.println("Você não é o Victor");
		}
		
		//expressão Logica pt. 2
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Que Horas são?: ");
		hora = sc.nextInt();
		
		if(hora < 12)
		{
			System.out.println("Bom Dia.");
		}
		else
		{
			if(hora < 18)
			{
				System.out.println("Boa Tarde.");
			}
			else 
			{
				System.out.println("Boa Noite");
			}
		}
		
		sc.close();
	}
}
