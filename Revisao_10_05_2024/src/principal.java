
public class principal {

	public static void main(String[] args) {
		// Laços de repetição
		// for
		// exibir os numeros impares entre 150 e 200

		for (int i = 150; i <= 200; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			} // if

		} // for

		// exibir os impares de outra forma
		for (int i = 150; i <= 200; i = i + 2) {

		} // for

		// multiplicação

		
		int resultado = 1;
		for (int i = 1; i <= 10; i = i ++) {
			resultado = resultado * i;
			
		}//for

		System.out.println(" O resultado da multiplicacao eh: " +  resultado);
		
		
	}

}
