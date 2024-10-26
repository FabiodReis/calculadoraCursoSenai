import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int menu;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero dos combos: \n"
				+ "1- X-Burguer + refrigerante --> R$ 15.00 \n"
				+ "2- X-Salada + Refrigerante --> R$ 20.00 \n"
				+ "3- Salgado + Regrigerante --> R$ 14.00 \n"
				+ "4- Misto-Quente + Refrigerante --> R$15.00 \n"
				+ "5- Pao de Queijo + Cafe com Leite --> R$ 8.00");
		menu = entrada.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("1- X-Burguer + refrigerante --> R$ 15.00");
		break;
		
		case 2:
			System.out.println("2- X-Salada + Refrigerante --> R$ 20.00");
		break;
		
		case 3:
			System.out.println("Salgado + Regrigerante --> R$ 14.00");
		break;
		
		case 4:
			System.out.println("Misto-Quente + Refrigerante --> R$15.00");
		break;
		
		
		case 5:
			System.out.println("Pao de Queijo + Cafe com Leite --> R$ 8.00");
		break;
		 default:
			 System.out.println("Opcao Invalida");
		
		}
		
		
		
		
		
		
		

	}

}
