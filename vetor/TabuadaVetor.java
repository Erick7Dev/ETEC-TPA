import java.util.Scanner;
public class TabuadaVetor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], i, ic, ii;
		final int TAM = 5;
		a = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o número:");
			a[i] = input.nextInt();
		}
		for(i=0, ic=0;ic<TAM; ic++, i++) {
			for(ii=1; ii<11;ii++){
				System.out.println(a[i]+" x "+ii+" = "+(a[i]*ii));
			}
			System.out.print("\n");
		}
		input.close();
	}

}
