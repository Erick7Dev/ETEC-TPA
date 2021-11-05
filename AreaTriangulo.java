import java.util.Scanner;
public class AreaTriangulo {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double area, base, h;
		System.out.println("Insira base do triangulo:");
		base = input.nextDouble();
		System.out.println("Insira altura do triangulo:");
		h = input.nextDouble();
		area = (base*h)/2;
		System.out.println("A area do triangulo é:"+area);
		input.close();
	}

}
