import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
	    	 
		double area, base, altura, raio, aresta;
		int opcao;
		System.out.println("O que voce quer calcular? selecione a opcao");
		System.out.println("1- Calcular a area de um retangulo \n" + "2- Calcular a area de um circulo \n"
				+ "3- Calcular a area de um cubo");
		Scanner entrada = new Scanner(System.in);
		opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			Scanner entrada1 = new Scanner(System.in);
			System.out.println("Digite o valor da base do retangulo: ");
			base = entrada1.nextDouble();
			System.out.println("Digite o valor da  altura do retangulo: ");
			altura = entrada1.nextDouble();
			area = base * altura;
			System.out.println(" A area do retangulo eh: " + area);
			break;

		case 2:
			Scanner entrada2 = new Scanner(System.in);
			System.out.println("Digite o valor do raio do circulo: ");
			raio = entrada2.nextDouble();
			area = Math.PI * raio * raio;
			System.out.println("A area do circulo eh: " + area);
			break;

		case 3:
			Scanner entrada3 = new Scanner(System.in);
			System.out.println("Digite o valor da aresta do cubo: ");
			aresta = entrada3.nextDouble();
			area = 6 * aresta * aresta;
			System.out.println("A area do cubo eh: " + area);
			break;

		default:
			System.out.println("Opcao invalida...");

		}
		
		
		
		
		
		
		
	}

}
