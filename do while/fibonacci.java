import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=1, f=0, f1=1, f2=1;
		System.out.println("Insira o número de termos");
		n = input.nextInt();
		do {
			f1=f2;
			f2=f;
			f=f1+f2;
			n--;
			System.out.println(f);
		}while (n>0);
		input.close();
		
	}

}

/*3-Dada a série de Fibonacci a seguir: 1,1,2,3,5,8,13,21,34...
Utilizando o laço de repetição FAÇA..ENQUANTO apresentar a série de Fibonacci até o enésimo termo, sendo que o número de termos N será informado pelo usuário.
*/