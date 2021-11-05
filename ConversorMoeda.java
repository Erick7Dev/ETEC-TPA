import java.util.Scanner;
public class ConversorMoeda {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double r, d, e, rd, re;
		System.out.println("Insira valor a ser convertido:");
		r = input.nextDouble();
		System.out.println("Insira cotação do dólar:");
		d = input.nextDouble();
		System.out.println("Insira cotação do euro:");
		e = input.nextDouble();
		rd = r/d;
		re = r/e;
		System.out.printf("O valor de reais inserido (R$"+r+") se converte para: $%.2f dólares. %n", (rd));
		System.out.printf("O valor de reais inserido (R$"+r+") se converte para: €%.2f euros. %n", (re));
		input.close();
		
	}

}
