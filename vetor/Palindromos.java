package vetor;
import java.util.Scanner;
public class Palindromos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], i, c;
		final int TAM = 10;
		a = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira um número:");
			a[i] = input.nextInt();
		}
		for(i=0, c=0; i<TAM; i++) {
			if(a[i]==a[9-i]) {
				c++;
			}
		}
		if(c==10) {
			System.out.println("É um palindromo.");
		}else {
			System.out.println("Não é um palindromo.");
		}
		input.close();
	}
}