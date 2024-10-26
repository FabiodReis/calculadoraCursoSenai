import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// WHILE - Revisão
		// Exibir os numeros de 1 a 100
		int num = 0;
		while (num <= 100) {
			System.out.println(num);
			num++;
		}

		//exibir os impares entre 100 e 200
		int num2 = 101;
		while(num2 <= 200) {
			System.out.println(num2);
			num2 = num2 + 2;
		}
		
		//programa que solicita ao usuario que seja
		// divisisel por 5, enquanto digitar errado, continuar
		//solicitando ao usuario
		
		
		int numero = 6;
		Scanner entrada1 = new Scanner(System.in);
		while(numero % 5 != 0) {
			System.out.println("Digite um numero divisivel por 5: ");
			numero = entrada1.nextInt();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
