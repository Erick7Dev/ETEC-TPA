import java.util.Scanner;
public class Idade {
	public static void main (String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int nas, atual, idade;
		
		System.out.println("Insira data de nascimento: ");
		nas = input.nextInt();
		System.out.println("Insira ano atual: ");
		atual = input.nextInt();
		idade = atual - nas;
		System.out.println("Sua idade é:"+idade);
		
		input.close();
	}
	
}
