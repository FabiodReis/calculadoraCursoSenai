import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		int numero;
		System.out.println("Impar ou par?");
		Scanner entrada = new Scanner(System.in);	
		System.out.println("Digite um numero:");
	    numero = entrada.nextInt();
		
		if(numero %2 == 0) {System.out.println("O numero eh par");}
		
		if(numero % 2 == 1) {System.out.println("O numero eh impar");}
		
	}
}
