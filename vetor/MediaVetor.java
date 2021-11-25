import java.util.Scanner;
public class MediaVetor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], i, soma, med;
		final int TAM = 10;
		a = new int [TAM];
		for(i=0, soma=0;i<TAM;i++) {
			System.out.println("Insira um número:");
			a[i] = input.nextInt();
			soma = soma+a[i];
		}
		med = soma/TAM;
		System.out.println("Média = "+med);
		input.close();
	}
}
