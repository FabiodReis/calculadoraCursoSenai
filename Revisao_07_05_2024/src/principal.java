
public class principal {

	public static void main(String[] args) {
		/*
		 * Operadores lógico Ctrl +shift + f --> indentação correta && --> E || --> Ou !
		 * --> Não
		 */

		int num = 5;
		// verificar se ele é impar
		if (num % 2 != 0) {
			System.out.println(num + " O numero eh impar");
		} // if

		// Operador OU -->
		String curso = "Java";
		// Bons cursos no momento são, java e python
		if (curso.equals("Java") || curso.equals("Python")) {
			System.out.println(" Bom curso no momento");
		}

		// carga horaria de 80h
		int carga_horaria = 80;
		if (curso.equals("Java") && carga_horaria == 80) {
			System.out.println(curso + " eh o curso que procuro");
		}

	}

}
