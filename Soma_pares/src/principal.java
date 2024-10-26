import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		int numero1, numero2, numero3, numero4, numero5;
		int soma = 0;

		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada3 = new Scanner(System.in);
		Scanner entrada4 = new Scanner(System.in);
		Scanner entrada5 = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		numero1 = entrada1.nextInt();

		if (numero1 % 2 == 0) {
			soma = soma + numero1;
		}
		
		System.out.println("Digite o segundo numero");
		

		numero2 = entrada2.nextInt();

		if (numero2 % 2 == 0) {
			soma = soma + numero1;
		}

		System.out.println("Digite o terceiro numero");
		
		numero3 = entrada3.nextInt();

		
		System.out.println("Digite o quarto numero");
		
		if (numero3 % 2 == 0) {
			soma = soma + numero1;
		}

	
		
		numero4 = entrada4.nextInt();

		if (numero4 % 2 == 0) {
			soma = soma + numero1;
		}

		System.out.println("Digite o quinto numero");
		
		numero5 = entrada5.nextInt();

		if (numero5 % 2 == 0) {
			soma = soma + numero1;
		}
		
		System.out.println("A soma dos pares eh: " + soma);
		
		
	}
	

}
