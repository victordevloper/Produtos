package Application;

import java.util.Locale;

public class project1_SaidaDeDados 
{
	public static void Execute()
	{
		double x = 10.35784;
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.printf("Resultado: %.2f metros %n ", x);
		Locale.setDefault(Locale.US);
	}
}
