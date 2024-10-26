public class Princinpal {

	public static void main(String[] args) {
		//Comentarios
		/*
		 * Comentarios vairias linhas
		 */
		//Precisamos efetuar uma soma com três numeros
		
		System.out.println("Soma de trees numeros: " + (15+30+45));
		
		//criação de variaveis
		/*
		 * inica-se preferenciamente com letra minunscula
		 * Nâo utiliza-se caracter especial
		 * não se inicia o nome de uma variavel com numeral
		 * não se pode utilizar palavras reservadas
		 */
		int numero1 = 15;
		int nuemro2 = 30;
		int numero3;
		numero3 = 45;
		
		System.out.println("A soma de tres numeros eh: "  + (numero1+nuemro2+numero3));
		int resultado_soma;
		
		resultado_soma = numero1+nuemro2+numero3;
		System.out.println("A soma do tres numeros eh " + resultado_soma);
		
		int resultado_multiplicacao = numero1*nuemro2*numero3;
		
		System.out.println ("A multiplicacao dos tres numeros eh: " + (resultado_multiplicacao));
		
		int resultado_subtracao = numero1-nuemro2-numero3;
		
		System.out.println("A subtracao dos tres numeros eh: " + (resultado_subtracao));
		
		int exibicao_divisao = nuemro2/numero1;
		
		System.out.println("A divisao de numero2 pelo numero1 eh: " + (exibicao_divisao));
		
		
		 float n1 = 15;
		 int n2 = 30;
		 
		float resultado;
		 
		resultado = n1/n2;
		
		System.out.printf("%.2f", resultado);
		

	}

}

