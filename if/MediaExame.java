import java.util.Scanner;
public class MediaExame {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		float n1, n2, m, ne;
		System.out.println("Insira primeira nota:");
		n1 = input.nextFloat();
		System.out.println("Insira segunda nota:");
		n2 = input.nextFloat();	
		m = (n1+n2)/2;
		if (m<3) {
			System.out.println("Reprovado");
		} else if (m>=6) {
			System.out.println("Aprovado");
		} else if (m>=3 && m<6) {
			System.out.println("Em exame");
			System.out.println("Insira nota do exame:");
			ne = input.nextFloat();
			m = (m+ne)/2;
			if (m>=6) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		}
		input.close();
	}

}