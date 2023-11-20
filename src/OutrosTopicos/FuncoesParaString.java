package OutrosTopicos;

public class FuncoesParaString 
{
	public static void Executar()
	{
		String nome = "Victor Lima";
		
		System.out.println(nome.toLowerCase()); //transforma todas as letras em minusculo
		System.out.println(nome.toUpperCase()); //transforma todas letras em maiusculo
		System.out.println(nome.trim()); // remove todos os espaços em branco
		System.out.println(nome.substring(2)); //não printa as 2 seguintes letras
		System.out.println(nome.replace('a', 'x')); //substitui determinada letra por outra
	}
}
