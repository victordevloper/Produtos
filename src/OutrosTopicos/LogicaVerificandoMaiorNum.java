package OutrosTopicos;

import java.util.Scanner;

public class LogicaVerificandoMaiorNum 
{
	public static void Executar()
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = Max(a, b, c);
		ShowResult(higher);
	}
	
	public static int Max(int a, int b, int c)
	{
		int aux;
		
		if(a > b && a > c)
		{
			aux = a;
		}
		else if(b > c )
		{
			aux = b;
		}
		else
		{
			aux = c;
		}
		
		return aux;
		
	}
	
	public static void ShowResult(int value)
	{
		System.out.println("higher: " + value);
	}
}
