import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		
	int nota1,nota2,nota3;
	int media = 0;
	String nome_aluno;
	
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada3 = new Scanner(System.in);
		Scanner entrada4 = new Scanner(System.in);
		Scanner entrada5 = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		nome_aluno = entrada1.nextLine();
		
		System.out.println("Digite a primeira nota");
		nota1 = entrada2.nextInt();
		
		System.out.println("Digite a segunda nota");
		nota2 = entrada3.nextInt();
		
		System.out.println("Digite a terceira nota");
		nota3 = entrada4.nextInt();
		
		media = (nota1 + nota2 + nota3)/3 ;
		
		if(media <= 4){
			System.out.println(nome_aluno + " Reprovado");
		}
		if(media > 4 && media <= 6) {
			System.out.println(nome_aluno + " Recuperacao");
		}
		
		else {System.out.println( nome_aluno + " Aprovado");
			
		}
		
		
		
		
		
		
		
	}

}
