import java.util.Scanner;
public class ImparPar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], b[], i;
		final int TAM = 20;
		a = new int [TAM];
		b = new int [TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"º número:");
			a[i] = input.nextInt();
			if(a[i]%2==0) {
				b[i] = a[i];
			}
		}
		System.out.print("Impares = ");
		for(i=0;i<TAM;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+", ");
			}
		}
		System.out.print("\nPares = ");
		for(i=0;i<TAM;i++) {
			if(b[i]!=0) {
				System.out.print(b[i]+", ");
			}
		}
		input.close();
	}
}
