import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
	
		String nomesCarros[] = new String[6];
		
		Scanner entrada1 = new Scanner(System.in);
		// for para preencher 
		for(int i = 0; i <= 4; i++) {
			System.out.println("Digite o nome do carro");
			nomesCarros[i] = entrada1.nextLine();
		}
		//for para exibir
		for(int i = 0; i <= 4; i++) {
			System.out.println(nomesCarros[i]);
		}

	}

}
