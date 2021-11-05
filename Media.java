import java.util.Scanner;
public class Media {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		float n1, n2, n3, m;
		System.out.println("Insira primeira nota:");
		n1 = input.nextFloat();
		System.out.println("Insira segunda nota:");
		n2 = input.nextFloat();
		System.out.println("Insira terceira nota:");
		n3 = input.nextFloat();	
		m = (n1+n2+n3)/3;
		System.out.println("A média das três notas é igual a "+m);
		input.close();
	}

}
