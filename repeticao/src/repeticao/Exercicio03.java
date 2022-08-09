//3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99.

package repeticao;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		int idade, soma21=0, soma50=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
		idade=entrada.nextInt();
		
		while(idade!=-99) {
			
			
			
			if(idade<21) {
				
				soma21++;
				
			} else if(idade>50) {
				
				soma50++;
				
			}
			
			System.out.print("Digite a idade: ");
			idade=entrada.nextInt();
			
			
		}
		
		entrada.close();
		System.out.println("Total de pessoas com menos de 21 anos: "+soma21);
		System.out.println("Total de pessoas com mais de 50 anos: "+soma50);
		
		
	}

}
