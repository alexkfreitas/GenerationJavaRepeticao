//5- Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)

package repeticao;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		int num, soma = 0;
		
		Scanner entrada = new Scanner(System.in);
				
		do {
			
			System.out.print("Digite um número: ");
			num=entrada.nextInt();
			
			soma+=num;
			
		} while(num!=0);
		
		entrada.close();
		System.out.println("A soma dos números digitados foi: "+soma);
		
	}
	
}
