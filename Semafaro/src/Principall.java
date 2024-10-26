import java.util.Scanner;

public class Principall {

	public static void main(String[] args) {
		
		/*
		 * Semaforo
		 * verde --> Seguir
		 * Amarelo --> Atenção
		 * Vermelho --> Pare
		 * exibir para o usuario
		 * digite o numero de acordoo com a cor
		 * 1- Verde
		 * 2- Amarelo
		 * 3- Vermelho
		 */
		
		int cor;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Sistema para Semaforo");
		System.out.println("**********************");
		System.out.println("Digite o numero de acordo" +
		"com a cor: \n"
				+"1 -  Verde \n"
		        +"2 - Amarelo \n"
				+"3 - Vermelho \n");
		cor = entrada.nextInt();
		
		if(cor == 1) {System.out.println("Siga");}
		if(cor == 2) {System.out.println("Atencao");}
		if(cor == 3) {System.out.println("Pare"); }
		
		
		
		

	}

}
