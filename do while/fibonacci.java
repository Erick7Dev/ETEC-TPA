import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=1, f=0, f1=1, f2=1;
		System.out.println("Insira o n�mero de termos");
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

/*3-Dada a s�rie de Fibonacci a seguir: 1,1,2,3,5,8,13,21,34...
Utilizando o la�o de repeti��o FA�A..ENQUANTO apresentar a s�rie de Fibonacci at� o en�simo termo, sendo que o n�mero de termos N ser� informado pelo usu�rio.
*/