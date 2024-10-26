package media_alunos;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		double nota1, nota2, media;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		nota1 =  entrada1.nextDouble();	
		System.out.println("Digite a segunda nota: ");
		nota2 =  entrada2.nextDouble();
		
		// Calculo da media--> Soma-se as notas e divide pela quantidade de notas
		media = (nota1 + nota2)/2;
		
		if(media <5) {
			System.out.println("Reprovado");
		}

		else if(media >=5 && media< 6) {
			System.out.println("recuperacao");
		}
				
		else {
			System.out.println("Aprovado");
		}
		
		
		
	
		
	}

}
