import java.util.Scanner;
public class IdadeWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int al=1, id, maid=0, meid=0;
		while (al<11) {
			System.out.println ("Insira idade:");
			id = input.nextInt();
			if (id>=18) {
				maid++;
				} else {
					meid++;
				}
			al++;
		}
		System.out.println("Alunos maiores de idade: "+maid);
		System.out.println("Alunos menores de idade: "+meid);
		input.close();
	}
}
