import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		System.out.println("Votacao...");
		int candidatos;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4= 0;
		int c5 = 0;
		int c6 = 0;
		
		
		Scanner entrada1 = new Scanner(System.in);

		while (true) {
			System.out.println("Digite o numero do seu candidato");
			System.out.println("1- Branco \n" + "2- Nulo \n" + "3- Kiko \n" + "4- Chaves \n" + "5- Chiquinha \n"
					+ "6- Seu Madruga \n" + "666- Encerrar votacao");
			candidatos = entrada1.nextInt();
			
			if(candidatos > 6 && candidatos < 666) {
				System.out.println("Numero invalido");
				
			}

			switch (candidatos) {

			case 1 :
				System.out.println("Branco");
				c1++;
				break;
			case 2:
				System.out.println("Nulo");
				c2++;
				break;

			case 3:
				System.out.println("Kiko");
				c3++;
				break;
				

			case 4:
				System.out.println("Chaves");
				c4++;
				break;
				
			case 5:
				System.out.println("Chiquinha");
				c5++;
				break;

			case 6:
				System.out.println("Seu madruga");
				c6++;
				break;
				
				
			case 666:
				
				
			}
			 
			if(candidatos == 666) {
				System.out.println("Votacao encerrada");
				System.out.println("Branco " +" = " + c1);
				System.out.println("Nulo " +" = " + c2);
				System.out.println("Kiko " +" = " + c3);
				System.out.println("Chaves " +"=" + c4);
				System.out.println("Chiquinha " +"=" + c5);
				System.out.println("Seu Madruga " +"=" + c6);
				break;
				
				
			}
			 
			}//while
			


		}

}
