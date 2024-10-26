import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int ano;
		String ano_e;
		
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.println("Digite o ano ");
		ano = entrada1.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
				{
			System.out.println("Ano bissexto");
		}
		
		else {
			System.out.println("Ano normal ");
		}
		
		

	}

}
