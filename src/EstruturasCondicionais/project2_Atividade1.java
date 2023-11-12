package EstruturasCondicionais;

import java.util.Locale;

public class project2_Atividade1
{
	public static void Executar()
	{
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf(product1 + " which price is $" + price1 + "%n");
		System.out.printf(product2 + " which price is $" + price2  + "%n");
		
		System.out.println("Record: " + age + " years old, code: " + code + " and gender: " + gender);
		System.out.println("Measure with eight decimal places: " + measure);
		System.out.print("Rouded (three decimal places): ");
		System.out.printf("%.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.print("US decimal point: ");
		System.out.printf("%.3f%n", measure);			
	}
			
}
