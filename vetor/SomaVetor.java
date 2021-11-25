import java.util.Scanner;
public class SomaVetor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int TAM =10;
		int a[], b[], c[], i;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor A:");
			a[i] = input.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor B:");
			b[i] = input.nextInt();
			c[i] = a[i]+b[i];
		}
		System.out.print("\nC = ");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
		input.close();
	}
}
