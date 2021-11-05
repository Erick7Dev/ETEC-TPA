import java.util.Scanner;
public class ConversorKm {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double m, km;
		System.out.println("Insira o valor (em metros) a ser convertido: ");
		m = input.nextDouble();
		km = m/1000;
		System.out.println("O valor inserido("+m+" metros)se converte para: "+km+"km");
		input.close();
	}

}
