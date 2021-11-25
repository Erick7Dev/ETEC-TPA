import java.util.Scanner;
public class IdadeGrupoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aa, i=1, id, na;
		while(i<7) {
			System.out.println("Insira o ano de nascimento:");
			na = input.nextInt();
			System.out.println("Insira o ano atual:");
			aa = input.nextInt();
			id = aa-na;
			System.out.println("Idade: "+id+" anos");
			if(id<18) {
				System.out.println("Menor de idade");
			}else {
				System.out.println("Maior de idade");
			}
			i++;
		}
		input.close();
	}
}
