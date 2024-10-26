import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Tabuada
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero para ver sua tabuada");
		numero = entrada.nextInt();
		
		//for --> loop ou laco de repeticao
		for(int num = 1 ;num<=100;num =num +1) {
			
			System.out.println(num + "  x + " + numero + "=" + numero* num);
			
			
			
		}
		
		
		
		
		
		System.out.println("-------------------------------------------------");
		
		
		System.out.println(" 1 x " + numero + " = " + numero*1);
		System.out.println(" 2 x " + numero + " = " + numero*2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
