import java.util.Scanner;
public class fatorial {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n, fat=1;
		System.out.println("Insira o n�mero a ser fatorado");
		n = input.nextInt();
		do {
			fat = fat*n;
			n--;
		}while (n>1);
		System.out.println(fat);
		input.close();
	}

}

/*1-Criar um programa que calcule e apresente o FATORIAL de um n�mero inteiro informado pelo usu�rio.
 *  O Fatorial de um n�mero � obtido da seguinte forma : 5!=5x4x3x2x1=120
 */