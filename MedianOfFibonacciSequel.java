package atividadeszap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;




public class Questão6 {

	public static void main(String[] args) {
		
		
		//Escreva um código que recebe um valor inteiro chamado 'contador' como parâmetro e 
		// retorna a mediana de uma sequência Fibonacci de tamanho igual ao valor do parâmetro.
	
		
		  
		int contador;
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
        contador = scanner.nextInt();
        
        for (; contador <= 0; ) {
            System.out.println("Insira um numero positivo, por favor: ");
            contador = scanner.nextInt();
        }
        	scanner.close();
            
		 
        
        	for (int rows = 1; rows <= contador; rows++) 
        	    if (contador == 1) {
        	        System.out.print(" "); 
        	    } else {
        	        System.out.print("" );	
        	    }

        	
		 
        	
        long[] fibonacci = new long[contador];
        
        fibonacci[0] = 0;
        if (contador > 1) {
          fibonacci[1] = 1;
        }
        
		
        
         for (int i = 2; i<contador; i++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
         System.out.print("{");
         for (int i = 0; i < contador; i++) {
        		System.out.print(fibonacci[i]);
        		if (i < contador - 1) {
        			System.out.print(", ");
        		
        		}
        	        
        		}
         System.out.print("}"); 
         if (contador % 2 ==1 ) {
 			System.out.println("\nA mediana desta sequencia e: "+ fibonacci[contador / 2]);
 		} else {
 			int meio1 = contador / 2;
 			int meio2 = meio1 - 1;
 			long mediana = (fibonacci[meio1] + fibonacci [meio2]);
 			System.out.println("\nA mediana desta sequencia e: "+ mediana);
        	}
 		
         }
	}
       

        	
        	
	


		
		
		
	 
		

						

		
		

	
		
	
	
	



		

			
			
		
		
		



