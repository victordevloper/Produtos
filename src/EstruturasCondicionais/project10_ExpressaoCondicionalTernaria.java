package EstruturasCondicionais;

public class project10_ExpressaoCondicionalTernaria 
{
	public static void Executar()
	{
		double preco = 34.5;
		double desconto = (preco < 20)? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		// essa estrutura pode substituir a expessão:
		// if(preco < 20) { desconto = preco * 0.1 } else { desconto = preco * 0.5 }
		//ela funciona da mesma forma.
	}
}
