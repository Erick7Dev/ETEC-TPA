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
			System.out.printf("Seu imc �:%. 2f", (imc));
			System.out.println("Deseja continuar? \n1-Sim \n2-N�o");
			resp = input.nextInt();
		}while (resp==1);
		input.close();
	}

}

/* 
 * 4-Criar um programa que leia o peso e a altura de uma pessoa. Calcular e apresentar o IMC. Ao final da execu��o, perguntar ao usu�rio se ele deseja continuar a execu��o(�Deseja continuar? 1-Sim / 2-N�o�)
 */