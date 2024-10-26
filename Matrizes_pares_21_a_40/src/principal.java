import java.awt.font.NumericShaper;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		int number[] = new int[20];

		System.out.println("Exibindo os numeros pares de 21 a 40: ");
		int aux = 22;
		for (int i = 0; i <= 9; i++) {
			number[i] = aux;
			aux = aux + 2;
		}

		for (int i = 0; i <= 9; i = i + 1) {
			System.out.println(number[i]);
		}

	}

}
