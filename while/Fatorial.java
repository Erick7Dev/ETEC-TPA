import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n, fat=1;
		System.out.println("Insira número a ser fatorado:");
		n = input.nextInt();
		if (n==0 || n==1) {
			System.out.print("1");
		} else {
			while (n>1) {
				fat = fat*n;
				n--;
			}
		}
		System.out.println(fat);
		input.close();
	}
}
