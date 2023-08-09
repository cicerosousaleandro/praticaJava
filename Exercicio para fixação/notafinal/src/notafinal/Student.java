package notafinal;

import java.util.Locale;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua nota:");
		
		
		
		double nota1 = sc.nextDouble();
		
		
		double nota2 = sc.nextDouble();
		
		
		double nota3 = sc.nextDouble();
		
		 
	     
	     
		if(nota1 + nota2 + nota3 >= 90.00) {
			System.out.println("pass");	
		}
		
		if(nota1 + nota2 + nota3 <= 52.00) {
			System.out.println("Failed");	
		}
		
		
		sc.close();

	}

}
