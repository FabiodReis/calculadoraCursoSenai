import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class principal {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();
		ArrayList<Integer> total = new ArrayList<>();

		System.out.println("Digite os numeros" + " Ou digite o numero \"Zero\" para sair");
		int numero;
		do {
			numero = scanner.nextInt();
			if (numero != 0) {
				numeros.add(numero);
				if (numero % 2 == 0) {
					pares.add(numero);
				} else {
					impares.add(numero);
				}
			}
		} while (numero != 0);

		Collections.sort(numeros);
		Collections.sort(pares);
		Collections.sort(impares);
		Collections.sort(total);

		System.out.println("Numeros organizados " + numeros);

		System.out.println("Numeros pares organizados" + pares);

		System.out.println("Numeros impares organizados" + impares);

	}

}
