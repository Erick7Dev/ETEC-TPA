import java.util.Scanner;
public class potenciacao {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int i=0, n, exp, res=1;
		System.out.println("Insira n�mero a ser potenciado");
		n = input.nextInt();
		System.out.println("Insira o expoente");
		exp = input.nextInt();
		do {
			res = (n*res);
			i++;
		}while (i<exp);
		System.out.println(res);
		input.close();
	}

}


/*2- Criar umprograma que leia uma base e um expoente, calcule e apresente a pot�ncia desse n�mero informado.
 *  N�o utilizar fun��es prontas, realizar o c�lculo utilizando o la�o FA�A..ENQUANTO
 */