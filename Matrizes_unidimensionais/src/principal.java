import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		// Criação de matrizes
		int idadesAlunos[];
		int[] idadesProfessores;

		idadesAlunos = new int[5];
		idadesProfessores = new int[10];

		int rasAlunos[] = new int[7];
		int idsProfessores[] = new int[6];

		int notaAluno[] = { 8, 9, 5, 6 };

		// exibindo as notas dos alunos

		System.out.println(notaAluno[0]);
		System.out.println(notaAluno[2]);

		// Exibir todas as notas de aluno
		for (int i = 0; i <= 3; i++) {
			System.out.println(notaAluno[i]);
		}

		String nomesAlunos[] = new String[4];
		// preenchendo nomes dos alunos
		nomesAlunos[0] = "Marcos Sipriano";
		nomesAlunos[1] = "Fabio ";
		nomesAlunos[2] = "Gabriel Henrique";
		nomesAlunos[3] = "Marcos Santos";
		
		//Exibindo os nomes dos alunos
		
		for(int i = 0; i <= 3; i++) {
			System.out.println(nomesAlunos[i]);
		}
		
		//Pedir para o usuario digitar 4 nomes
		
		System.out.println("_____________________________");
		Scanner entrada1 = new Scanner(System.in);
		// for para preencher 
		for(int i = 0; i <= 3; i++) {
			System.out.println("Digite o nome do aluno");
			nomesAlunos[i] = entrada1.nextLine();
		}
		//for para exibir
		for(int i = 0; i <= 3; i++) {
			System.out.println(nomesAlunos[i]);
		}
		
		
		System.out.println("_______________________");
		//Tamanho matrizes
		System.out.println(nomesAlunos.length);
		
		int tamanhoMatriz= nomesAlunos.length;
		
		
		
		for(int i = 0; i<= tamanhoMatriz; i++) {
			System.out.println(nomesAlunos[i]);
		}
		
		
		

	}

}
