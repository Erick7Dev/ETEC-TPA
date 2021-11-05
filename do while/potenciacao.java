import java.util.Scanner;
public class potenciacao {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int i=0, n, exp, res=1;
		System.out.println("Insira número a ser potenciado");
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


/*2- Criar umprograma que leia uma base e um expoente, calcule e apresente a potência desse número informado.
 *  Não utilizar funções prontas, realizar o cálculo utilizando o laço FAÇA..ENQUANTO
 */