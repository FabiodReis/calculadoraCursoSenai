import java.util.Scanner;

public class principal2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade ;
		System.out.println("Digite sua idade: ");
		//Se a pessoa tiver dezoito ou mais, é maior de idade
		idade = entrada.nextInt();	
		
		if(idade > 17) {
			System.out.println("A pessoa eh de maior");
		}
		else {
			System.out.println("A pessoa eh menor de idade");
		}
		
		
		
		

	}

}
