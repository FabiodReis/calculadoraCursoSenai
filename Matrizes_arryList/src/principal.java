import java.util.ArrayList;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Trabalhando com Array List
		
		ArrayList<String> carros = new ArrayList<String>();
		carros.add("Corolla");
		carros.add("Fusion");
		carros.add("New Civic");
		carros.add("Ideia");
				
		for(String carro: carros) {
			System.out.println(carro);
		}
		
		carros.remove("Meriva");
		for(String carro: carros) {
			System.out.println(carro);
		}
		
		//Interacao do usuario
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Digite o modelo de um carro: ");
		carros.add(entrada1.nextLine());
		for(String carro: carros) {
			System.out.println(carro);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
