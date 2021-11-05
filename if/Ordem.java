import java.util.Scanner;
public class Ordem {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("Insira o primeiro valor:");
		a = input.nextInt();
		System.out.println("Insira o segundo valor:");
		b = input.nextInt();
		System.out.println("Insira o terceiro valor:");
		c = input.nextInt();
		if (a<b && b<c) {
			System.out.println(a+", "+b+", "+c);
		} else if (c<b && b<a) {
			System.out.println(c+", "+b+", "+a);
		} else if (b<c && c<a) {
			System.out.println(b+", "+c+", "+a);
		}else if (a<c && c<b) {
			System.out.println(a+", "+c+", "+b);
		}else if(c<a && a<b) {
			System.out.println(c+", "+a+", "+b);
		}else {
			System.out.println(b+", "+a+", "+c);
		}
		input.close();
	}

}