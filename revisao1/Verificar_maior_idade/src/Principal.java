import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		
		if(idade> 17) System.out.println("Maior de idade");
		
		if (idade< 18) System.out.println("Menor de idade");
		
		

	}

}
