import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		/*
		 * if, if else,else if else
		 * operadores : &&, ||, !
		 * ==,!=,equals()
		 */
		
		/*
		 * Switch
		 verefique o numero referente ao dia da semana
		e informe qual o dia em texto e uma mensagem positica
		*/
		
		int opcao_dia_semana;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o numero referente ao dia da semana: ");
		System.out.println("1 -Domingo /n" +
			"2- Segunda-feira \n" +
			"3- terca-feira \n" +
			"4- Quarta-feira \n" +
			"5- Quinta-feira \n" +
			"6- Sexta-feira \n" +
			"7- Sabado");
		opcao_dia_semana = entrada.nextInt();
		switch(opcao_dia_semana) {
		case 1:
			System.out.println("O dia da semana eh Domingo \n" +
		"Dia de desncanso natural !!!");
		break;
		
		case 2:
			System.out.println("O dia da semana eh Segunda-feira \n" +
		"Dia de trabalho duro !!!");
		break;
		
		case 3:
			System.out.println("O dia da semana eh Terca-feira \n" +
		"Dia de trabalho novamente !!!");
		break;
		
		case 4:
			System.out.println("O dia da semana eh Quarta-feira \n" +
		"Dia de assistir o tricolor !!!");
		break;
		
		case 5:
			System.out.println("O dia da semana eh Quinta-feira \n" +
		"Dia de estudar java !!!");
		break;
		
		case 6:
			System.out.println("O dia da semana eh Sexta-feira \n" +
		"Dia de comer um lache!!!");
		break;
		
		case 7:
			System.out.println("O dia da semana eh Sabadao \n" +
		"Dia de dar um role !!!");
		break;
		default:
			System.out.println("Dia da semana invalido");
		}

	}

}
