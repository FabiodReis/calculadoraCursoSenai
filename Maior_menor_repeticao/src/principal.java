import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
	int numeroDigitado;
	int maior = 0;
	int menor = 9999999;
	
	
	Scanner entrada1 = new Scanner(System.in);
	 for(int i = 1 ; i <= 3 ; i ++) {
		 System.out.println("digite o " + i + " numero ");
		 numeroDigitado = entrada1.nextInt();
		 
		 if(numeroDigitado >maior) {
			 maior = numeroDigitado;
		 }
		 
		 if(numeroDigitado < menor) {
			 menor = numeroDigitado;
		 }
				 
				 
				 
				 
	 }
	
		System.out.println(" O maior numero digitado foi o " + maior);
		System.out.println(" O menor numero digitado foi o " + menor);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
