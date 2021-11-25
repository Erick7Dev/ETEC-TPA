package vetor;
import java.util.Scanner;
public class OrdemCres {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], b[], i, mi, ii, x;
		final int TAM = 5;
		a = new int [TAM];
		b = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira um número:");
			a[i] = input.nextInt();
			b[i] = a[i];
		}
		for(i=0;i<TAM-1;i++) {
			mi = i;
			for(ii=i+1;ii<TAM;ii++) {
				if(b[ii]<b[mi]) {
					mi = ii;
				}
			}
			x = b[i];
			b[i] = b[mi];
			b[mi] = x;
		}
		for(i=0;i<TAM;i++) {
			System.out.println(b[i]);
		}
		input.close();
	}
}