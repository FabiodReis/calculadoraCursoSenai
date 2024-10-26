import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Números no intervalo entre " + numero1 + " e " + numero2 + ":");

        
        int menorNumero = Math.min(numero1, numero2);
        int maiorNumero = Math.max(numero1, numero2);

      
        int numeroAtual = menorNumero;

      
        while (numeroAtual <= maiorNumero) {
            System.out.println(numeroAtual);
            numeroAtual++;
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
