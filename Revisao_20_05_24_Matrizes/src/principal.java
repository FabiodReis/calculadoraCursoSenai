import java.util.Scanner;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		// Exibir lista de nomes inseridos pelo usuario
		String nome[] = new String[5];
		Scanner entrada1 = new Scanner(System.in);
		
		// for para preencher
		
		//for(int i= 0;  i< 5;i++) {
			//System.out.println("Digite o " + (i+1)+ " nome");
			//nome[i] = entrada1.nextLine(); 
		//}
				
	//for(String nome_exbir: nome) {
		//	System.out.println(nome_exbir);
		//}
				
		//Utilizando o painel
		//for para preencher
		for(int i =0; i < 5; i++) {
			nome[i] = JOptionPane.showInputDialog("Digite o " + (i+1) + " nome") ;
		}
		
		//for exibir
		for(int i = 1; i<5; i++) {
			JOptionPane.showMessageDialog(null, nome[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				

	}//main

}
