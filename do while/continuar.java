import java.util.Scanner;
public class continuar {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		float p, h, imc, resp;
		do {
			System.out.println("Insira seu peso");
			p = input.nextFloat();
			System.out.println("Insira sua altura");
			h = input.nextFloat();
			imc = p/(h*h);
			System.out.printf("Seu imc é:%. 2f", (imc));
			System.out.println("Deseja continuar? \n1-Sim \n2-Não");
			resp = input.nextInt();
		}while (resp==1);
		input.close();
	}

}

/* 
 * 4-Criar um programa que leia o peso e a altura de uma pessoa. Calcular e apresentar o IMC. Ao final da execução, perguntar ao usuário se ele deseja continuar a execução(“Deseja continuar? 1-Sim / 2-Não”)
 */