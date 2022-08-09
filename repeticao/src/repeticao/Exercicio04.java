//4- Uma empresa desenvolveu uma pesquisa para saber as características
//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
//pessoas, calcule e mostre: (WHILE)
// o número de pessoas calmas;
// o número de mulheres nervosas;
// o número de homens agressivos;
// o número de outros calmos;
// o número de pessoas nervosas com mais de 40 anos;
// o número de pessoas calmas com menos de 18 anos.

package repeticao;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		int idade,opSex, op, dados=1,pessoasCalmas=0,mulheresNervosas=0,homensAgressivos=0,outrosCalmos=0,pessoasNervosas40=0,pessoasCalmas18=0;
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		while(dados<=150) {
			
			System.out.print("\nDigite sua idade: ");
			idade=entrada.nextInt();
			
			
			System.out.print("\n1-Feminino\n2-Masculino\n3-Outros\nDigite a opção que corresponde a seu sexo: ");
			opSex=entrada.nextInt();
			
			System.out.print("\n\nEscolha uma opção abaixo: \n1-Sou uma pessoa calma\n2-Sou nervosa\n3-Sou agressiva\nOpção: ");
			op=entrada.nextInt();
			
			if(op==1) {
				
				pessoasCalmas++;
			
			} 
			if(op==2 && opSex==1) {
				
				mulheresNervosas++;
				
			}
			if(op==3 && opSex==2) {
				
				homensAgressivos++;
				
			}
			if(opSex==3 && op==1) {
				
				outrosCalmos++;
				
			}
			if(op==2 && idade>40) {
				
				pessoasNervosas40++;
				
			}
			if(op==1 && idade<18) {
				
				pessoasCalmas18++;
				
			}
			
			dados++;
			
			
		}
		
		entrada.close();
		
		System.out.println("\nNúmero de pessoas calmas: "+pessoasCalmas);
		System.out.println("Número de mulheres nervosas: "+mulheresNervosas);
		System.out.println("Número de homens agressivos: "+homensAgressivos);
		System.out.println("Número de outros calmos: "+outrosCalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+pessoasNervosas40);
		System.out.println("Numero de pessoas calmas com menos de 18 anos: "+pessoasCalmas18);
		
		
	}
	
}
