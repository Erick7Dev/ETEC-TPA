import java.util.Scanner;
public class Tabuada {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int n, n2, n3, n4, n5, n6, n7, n8, n9, n10;
		System.out.println("Insira número a ser multiplicado:");
		n = input.nextInt();
		n2 = n*2;
		n3 = n*3;
		n4 = n*4;
		n5 = n*5;
		n6 = n*6;
		n7 = n*7;
		n8 = n*8;
		n9 = n*9;
		n10 = n*10;
		System.out.println("Tabuada do"+n);
		System.out.println(n+" * 1 = "+n);
		System.out.println(n+" * 2 = "+n2);
		System.out.println(n+" * 3 = "+n3);
		System.out.println(n+" * 4 = "+n4);
		System.out.println(n+" * 5 = "+n5);
		System.out.println(n+" * 6 = "+n6);
		System.out.println(n+" * 7 = "+n7);
		System.out.println(n+" * 8 = "+n8);
		System.out.println(n+" * 9 = "+n9);
		System.out.println(n+" * 10 = "+n10);
		input.close();
	}
	

}
