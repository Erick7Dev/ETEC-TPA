import java.util.Scanner;
public class Volume {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double r, h, v;
		System.out.println("Insira raio da lata:");
		r = input.nextDouble();
		System.out.println("Insira altura da lata:");
		h = input.nextDouble();
		v = 3.14*(r*r)*h;
		System.out.println("O volume da lata é igual a "+v);
		input.close();
		
	}

}
