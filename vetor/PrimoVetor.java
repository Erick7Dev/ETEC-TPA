import java.util.Scanner;
public class PrimoVetor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], i, ii, r=0;
		final int TAM = 10;
		a = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira um número inteiro:");
			a[i] = input.nextInt();
		}
		for(i=0;i<TAM;i++) {
			r=0;
			for(ii=1;ii<=a[i];ii++) {
				if(a[i]%ii==0) {
					r++;
				}
			}
			if(r==2 || a[i]==1) {
				System.out.println(a[i]+" é um número primo.\n");
			}else {
				System.out.println(a[i]+" não é um número primo.\n");
			}
		}
		input.close();
	}
}
