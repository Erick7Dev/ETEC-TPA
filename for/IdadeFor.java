import java.util.Scanner;
public class IdadeFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, i1=0, i2=0, i3=0, i4=0, i5=0, id, p1, p2, p3, p4, p5;
		for(i=0;i<=15;i++) {
			System.out.println("Insira uma idade:");
			id = input.nextInt();
			if(id<=15) {
				i1++;
			}else if(id>=16 && id<=30) {
				i2++;
			}else if(id>=31 && id<=45) {
				i3++;
			}else if(id>=46 && id<=60) {
				i4++;
			}else {
				i5++;
			}
		}
		p1 = (i1*100)/15;
		p2 = (i2*100)/15;
		p3 = (i3*100)/15;
		p4 = (i4*100)/15;
		p5 = (i5*100)/15;
		System.out.println("Pessoas na 1ª faixa etária: "+i1+" pessoas, porcentagem: "+p1);
		System.out.println("Pessoas na 2ª faixa etária: "+i2+" pessoas, porcentagem: "+p2);
		System.out.println("Pessoas na 3ª faixa etária: "+i3+" pessoas, porcentagem: "+p3);
		System.out.println("Pessoas na 4ª faixa etária: "+i4+" pessoas, porcentagem: "+p4);
		System.out.println("Pessoas na 5ª faixa etária: "+i5+" pessoas, porcentagem: "+p5);
	}

}
