import java.util.Scanner;

import Modelos.carro;

public class principal {

	public static void main(String[] args) {
		// //Utilizando um tipo nao primitivo
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada3 = new Scanner(System.in);
		carro meuCarro = new carro();
		
		
		System.out.println("Digite a cor do carro");
		meuCarro.setCor(entrada.nextLine());
		
		System.out.println("Digite o Ano do carro");
		meuCarro.setAno(entrada1.nextInt());
		
		System.out.println("Digite o modelo do carro");
		meuCarro.setModelo(entrada2.nextLine());
		
		
		
		System.out.println("Digite a placa do carro");
		meuCarro.setPlaca(entrada3.nextLine());
		
		//Exbindo os valores exibidos
		//corrgir erro
		System.out.println("A cor do carro eh; " + meuCarro.getCor());
		System.out.println("O Ano do carro eh; " + meuCarro.getAno());
		System.out.println("O modelo do carro eh; " + meuCarro.getModelo());
		
		
		
		
		
		
		
		
		System.out.println("teste");
		
		
		
		

	}

}
