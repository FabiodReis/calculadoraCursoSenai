import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Entrada de dados --> Biblioteca Scanner
		 * pedidr a interação do usuario
		 * em uma soma vamos pedir para o usuario digitat dois mumeros
		 * e na sequencia exibiremos a sona
		 */
		
		int numero1;
		int numero2;
		//pedir para o usuario digitar um numero
		Scanner entrada =new Scanner(System.in);
		System.out.println("Digiteum numero: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite outro numero ");
		numero2 = entrada.nextInt();
		 
		//soma
		int soma = numero1 + numero2;
		System.out.println("A soma dos numeros eh :" +soma);
				
		
		

	}

}
