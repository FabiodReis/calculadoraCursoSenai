import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
    double n1, n2, n3, n4 , n5;
    double media;
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
    	
    
    	media = (n1 + n2 + n3 + n4 + n5 ) / 5;
    	
    	System.out.println("A media eh: " + media);
    	
    	break;
    	
    	
    	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
