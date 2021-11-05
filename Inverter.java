import java.util.Scanner;
public class Inverter {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("Insira valor de A:");
		a = input.nextInt();
		System.out.println("Insira valor de B:");
		b = input.nextInt();
		c = a;
		a = b;
		b = c;
		
		System.out.println("Valor de A:"+a);
		System.out.println("Valor de B:"+b);
		input.close();
	}

}
