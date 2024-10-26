package maior_numero_while2;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		double n1, n2, n3, n4 , n5;
	    double maior;
	    Scanner entrada1 = new Scanner(System.in); 
	    Scanner entrada2 = new Scanner(System.in); 
	    Scanner entrada3 = new Scanner(System.in); 
	    Scanner entrada4 = new Scanner(System.in); 
	    Scanner entrada5 = new Scanner(System.in); 
	    
	    while(true) {
	    	System.out.println("Digite o primeiro numero: ");
	    	n1 = entrada1.nextDouble();  

	    	System.out.println("Digite o segundo numero: ");
	    	n2 = entrada2.nextDouble();  
	    	
	    	System.out.println("Digite o terceiro numero ");
	    	n3 = entrada3.nextDouble();  
	    	
	    	System.out.println("Digite o quarto numero: ");
	    	n4 = entrada4.nextDouble();  
	    	
	    	System.out.println("Digite o quinto numero: ");
	    	n5 = entrada5.nextDouble();  
	    	
	    if(n1 > n2 & n1 > n3 & n1 > n4 & n1> n5) {
	    	System.out.println("O numero " + n1 + " eh o maior");
	    }
	    
	    if(n2 > n1 & n2> n3 & n2 > n4 & n2> n5) {
	    	System.out.println("O numero " + n2 + " eh o maior");
	    }
	    
	    
	    if(n3 > n1 & n3 > n2 & n3 > n4 & n3> n5) {
	    	System.out.println("O numero " + n3 + " eh o maior");
	    }
	    
	    if(n4 > n1 & n4 > n2 & n4 > n3 & n4> n5) {
	    	System.out.println("O numero " + n4 + " eh o maior");
	    }
	    
	    if(n5 > n1 & n5 > n2 & n5 > n3 & n5> n4) {
	    	System.out.println("O numero " + n5 + " eh o maior");
	    }
	    	break;
	    	}
		
		
		
		
		

	}

}
