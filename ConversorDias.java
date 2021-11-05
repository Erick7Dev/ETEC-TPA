import java.util.Scanner;
public class ConversorDias {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int d, m, a;
		System.out.println("Insira número de dias:");
		d = input.nextInt();
		m = d/30;
		a = d/365;
		System.out.println(d+" dias convertido para meses é igual a: "+m+" meses");
		System.out.println(d+" dias convertido para anos é igual a: "+a+" anos");
		input.close();
	}

}
