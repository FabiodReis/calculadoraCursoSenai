import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		int idade;
		Scanner entrada1 = new Scanner(System.in); 
		
		System.out.println("Digite sua idade: ");
		idade = entrada1.nextInt();		
		
		if(idade >=5 && idade <= 7 ) {
			System.out.println("Infatil A");
		}
		
		if(idade >=8 && idade <= 10 ) {
			System.out.println("Infatil B");
		}

		if(idade >=11 && idade <= 13 ) {
			System.out.println("Infatil C");
		}
		
		if(idade >=14 && idade <= 17 ) {
			System.out.println("Infatil D");
		}
		
		if( idade >= 18) {
			System.out.println("Senior");
		}
		
		
		
	}

}
