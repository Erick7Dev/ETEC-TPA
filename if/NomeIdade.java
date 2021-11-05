import java.util.Scanner;
public class NomeIdade {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		 String n, nv, nn;
		 int id, idv, idn;
		 System.out.println("Insira o primeiro nome:");
		 n = input.next();
		 nv = n;
		 nn = n;
		 System.out.println("Insira a primeira idade:");
		 id = input.nextInt();
		 idv = id;
		 idn = id;
		 System.out.println("Insira o segundo nome:");
		 n = input.next();
		 System.out.println("Insira a segunda idade:");
		 id = input.nextInt();
		 if (id>idv) {
			 nv = n;
			 idv = id;
		 } else {
			 nn = n;
			 idn = id;
		 }
		 System.out.println("Insira o terceiro nome:");
		 n = input.next();
		 System.out.println("Insira a terceira idade:");
		 id = input.nextInt();
		 if (id>idv) {
			 nv = n;
			 idv = id;
		 } else {
			 nn = n;
			 idn = id;
		 }
		 System.out.println("Insira o quarto nome:");
		 n = input.next();
		 System.out.println("Insira a quarta idade:");
		 id = input.nextInt();
		 if (id>idv) {
			 nv = n;
			 idv = id;
		 } else {
			 nn = n;
			 idn = id;
		 }
		 System.out.println("Insira o quinto nome:");
		 n = input.next();
		 System.out.println("Insira a quinta idade:");
		 id = input.nextInt();
		 if (id>idv) {
			 nv = n;
			 idv = id;
		 } else {
			 nn = n;
			 idn = id;
		 }
		 System.out.println("O usuário mais velho é "+nv+" com "+idv+" ano(s)");
		 System.out.println("O usuário mais novo é "+nn+" com "+idn+" ano(s)");
		 input.close();
	}
}
