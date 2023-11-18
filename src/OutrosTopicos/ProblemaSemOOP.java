package OutrosTopicos;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSemOOP 
{
	public static void Executar()
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double aX, bX, cX, aY, bY, cY; 
		
		System.out.println("Enter the measures of triangle X: ");
		 aX = sc.nextDouble();
		 bX = sc.nextDouble();
		 cX = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		 aY = sc.nextDouble();
		 bY = sc.nextDouble();
		 cY = sc.nextDouble();
		
		double p = (aX + bX + cX) / 2.0;
		double areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));
		
		p = (aY + bY + cY) / 2.0;
		double areaY = Math.sqrt(p * (p - aY) * (p - bY) * (p - cY));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY)
		{
			System.out.println("Larger area: X");
		}
		else
		{
			System.out.println("Larger area: Y");
		}
		
		sc.close();
		
	}
}
