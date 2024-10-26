import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		
		double resultado;
		
		//resultado = 5/2f;
		//resultado = 5%2;
		//System.out.println(resultado);
		
		int numero_digitado;
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero_digitado =  entrada.nextInt();
		
		// Vereficar se o numero é impar
		
		if((numero_digitado%2) == 0) 
		{ System.out.println("O numero " + numero_digitado
				+ " eh par");
		
		//verificar se o numero é impar
		
		if((numero_digitado%2) != 0 ) {
			System.out.println("O numero_digitadoo" + numero_digitado+ "eh impar" );
		}
		
		//outra forma de verificar o impar
		if((numero_digitado%2) ==1) {
			System.out.println("O numero " + numero_digitado + " eh impar");
			
		}
		
		
		}
		
		
		
		
		
		
		

	}

}
