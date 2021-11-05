import java.util.Scanner;
public class Triangulo {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("Insira o primeiro valor:");
		a = input.nextInt();
		System.out.println("Insira o segundo valor:");
		b = input.nextInt();
		System.out.println("Insira o terceiro valor:");
		c = input.nextInt();
		if (a == b && b == c) {
			System.out.println("Triângulo equilátero.");
		} else if (a != b && b != c && a != c) {
			System.out.println("Triângulo escaleno.");
		} else {
			System.out.println("Triângulo isósceles.");
		}
		input.close();
	}
}