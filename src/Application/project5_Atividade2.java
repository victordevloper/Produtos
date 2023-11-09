package Application;

import java.util.Locale;
import java.util.Scanner;

public class project5_Atividade2 
{
	public static void Executar()
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
		
		R = sc.nextDouble();
		A = pi * R * R;
		
		System.out.printf("A=%.4f%n", A);
		sc.close();
		
	}
}