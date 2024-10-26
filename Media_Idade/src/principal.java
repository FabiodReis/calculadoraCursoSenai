
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		int soma_quantidade_mulheres = 0;
		int soma_quantidade_homens = 0;
		int soma_idade_mulheres = 0;
		int soma_idade_homens = 0;
		int sexo_pessoa, idade_pessoa;
		double media_idade_homens, media_idade_mulheres, media_grupo;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println(
					"Qual o sexo da pessoa a ser cadastrada? \n" + "\n 1 para homens" + "\n 2 para  mulheres \n");
		}
		sexo_pessoa = entrada1.nextInt();
		switch (sexo_pessoa) {
		
		case 1:
			System.out.println("Digite a idade da pessoa");
			idade_pessoa = entrada2.nextInt();
			soma_idade_homens = soma_quantidade_homens + 1;
			soma_idade_homens = soma_idade_homens + idade_pessoa;

			break;

		case 2:
			System.out.println("Digite a idade da pessoa");
			idade_pessoa = entrada2.nextInt();
			soma_idade_mulheres = soma_quantidade_mulheres + 1;
			soma_idade_homens = soma_idade_mulheres + idade_pessoa;

			break;

		default: {
			System.out.println("Codigo invalido");
		}
		}

		media_idade_homens = soma_idade_homens / soma_quantidade_homens;
		System.out.println("A media de idade dos homens eh: " + media_idade_homens);

		media_idade_mulheres = soma_idade_mulheres / soma_quantidade_mulheres;
		System.out.println("A media de idade dos homens eh; " + media_idade_mulheres);

		media_grupo = (media_idade_homens + media_idade_mulheres) / 10;
		System.out.println(" A media de idade do grupo eh: " + media_grupo);

	}

}
