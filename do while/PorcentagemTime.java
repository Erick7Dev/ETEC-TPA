import java.util.Scanner;
public class PorcentagemTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ti, i=1, t1=0, t2=0, t3=0, t4=0, t5=0, p1, p2, p3, p4, p5;
		do {
			System.out.println("1 - São Paulo");
			System.out.println("2 - Corinthians");
			System.out.println("3 - Palmeiras");
			System.out.println("4 - Santos");
			System.out.println("5 - Outros");
			System.out.println("Escolha o time torcido:");
			ti = input.nextInt();
			if(ti==1) {
				t1++;
			}else if(ti==2) {
				t2++;
			}else if(ti==3) {
				t3++;
			}else if(ti==4) {
				t4++;
			}else {
				t5++;
			}
			i++;
		}while(i<11);
		p1 = (t1*100)/10;
		p2 = (t2*100)/10;
		p3 = (t3*100)/10;
		p4 = (t4*100)/10;
		p5 = (t5*100)/10;
		System.out.println("Porcentagem de torcedores:");
		System.out.println("São Paulo: "+p1);
		System.out.println("Corinthians: "+p2);
		System.out.println("Palmeiras: "+p3);
		System.out.println("Santos: "+p4);
		System.out.println("Outros: "+p5);
		input.close();
	}
}
