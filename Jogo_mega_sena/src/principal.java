import java.util.Random;

public class principal {

	public static void main(String[] args) {

		System.out.println("Mega Sena");
		Random num = new Random();
		for (int i = 1; i <= 6; i++) {
			int randow = num.nextInt(60);
			System.out.println(" Os numeros sorteados foram: " + randow);
		}
		
		
		
		
		
		

	}

}
