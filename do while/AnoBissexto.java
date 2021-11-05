import java.util.Scanner;
public class AnoBissexto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int anoin, anofin, quantano=0, ano;
		System.out.println("Insira o ano inicial:");
		anoin = input.nextInt();
		System.out.println("Insira o ano final:");
		anofin = input.nextInt();
		ano = anoin;
			while (ano%4!=0) {
				ano++;
			}
			do {
				System.out.println(ano+" é um ano bissexto.");
				ano = ano+4;
				quantano++;
			}while (ano<anofin);
	System.out.println("Total de anos bissextos entre o ano de "+anoin+" e o ano de "+anofin+": "+quantano);
	input.close();
	}
}

