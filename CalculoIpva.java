import java.util.Scanner;
public class CalculoIpva {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double valor, ipva;
		System.out.println("Insira valor do veículo: ");
		valor = input.nextDouble();
		ipva = (4*valor)/100;
		System.out.println("o IPVA do veículo é: R$"+ipva);
		input.close();
	}

}
