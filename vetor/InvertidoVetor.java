import java.util.Scanner;
public class InvertidoVetor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], b[], i;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira um número:");
			a[i] = input.nextInt();
			b[9-i] = a[i];
		}
		for(i=0;i<TAM;i++) {
			System.out.println(b[i]);
		}
		input.close();
	}
}
