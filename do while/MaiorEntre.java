import java.util.Scanner;
public class MaiorEntre {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, nn, n, nm;
		do{
			System.out.println("Insira número de valores:");
			nn = input.nextInt();
			i=1;
			nm=0;
			while (i<=nn) {
				System.out.println("Insira o valor:");
				n = input.nextInt();
				if(n>nm) {
					nm = n;
				}
				i++;
			}
			if (nn!=0){
				System.out.println("O maior número inserido é: "+nm);
			}
		}while (nn!=0);
		input.close();
	}
}