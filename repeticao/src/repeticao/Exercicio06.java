//6- Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)

package repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int num, divisor=0;
		double media, somaMultiplos=0.0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número inteiro: ");
			num=teclado.nextInt();
			
			if(num%3==0) {
				somaMultiplos+=num;
				divisor++;
			}
			
			
		} while(num!=0);
		
		media=somaMultiplos/(divisor-1);
		
		teclado.close();
		
		System.out.println("Média dos números múltiplos de 3 digitados: "+media);
		
		
		
		
		
	}
	
}
