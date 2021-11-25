package vetor;
import java.util.Scanner;
public class BuscaVetor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], b=0, i, r=0;
		final int TAM = 10;
		a = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira um número:");
			a[i] = input.nextInt();
		}
		System.out.println("Insira o número a ser buscado:");
		b = input.nextInt();
		for(i=0;i<TAM;i++) {
			if(a[i]==b) {
				r = 1;
			}
		}
		if(r==1) {
			System.out.println("O número "+b+" está dentro do vetor.");
		}else {
		System.out.println("O número "+b+" não está dentro do vetor.");
		}
		input.close();
	}
}
