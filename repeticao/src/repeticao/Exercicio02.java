//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.


package repeticao;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		int numero, somaPar=0, somaImpar=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			
			
			System.out.print("Digite o "+i+"º número: ");
			numero=entrada.nextInt();
			
			if(numero%2==0) {
				
				somaPar++;
				
			} else {
				
				somaImpar++;
				
			}
		
		}
		
		entrada.close();
		
		System.out.println("Total de números pares: "+somaPar);
		System.out.println("Total de números ímpares: "+somaImpar);
		
	}

}
