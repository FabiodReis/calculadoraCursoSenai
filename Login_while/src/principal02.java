import java.util.Scanner;

public class principal02 {

	public static void main(String[] args) {
		String login = "";
		String senha = "";
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Digite o seu Login: ");
			login = entrada1.nextLine();
			System.out.println("Digite a sua senha: ");
			senha = entrada2.nextLine();
			
			if(login.equals("Admin" ) && senha.equals("1234")) {
				System.out.println("Acesso ao sistema concedido");
				break;}
			
			else {
				System.out.println("Acesso negado");
			}//else
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
