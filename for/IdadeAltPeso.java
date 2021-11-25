import java.util.Scanner;
public class IdadeAltPeso {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int id, maid=0, meid=0, id50=0, h, sh=0, ih=0, mh, kg, kgi=0, pkg=0, maidkg=0, meidkg=0, i;
		for(i=1;i<=25;i++) {
			System.out.println("Insira a idade:");
			id = input.nextInt();
			maid = id;
			meid = id;
			System.out.println("Insira a altura:");
			h = input.nextInt();
			System.out.println("Insira o peso:");
			kg = input.nextInt();
			if(id>50) {
				id50++;
			}
			if(id>10 && id<20) {
				sh = sh+h;
				ih++;
			}
			if(kg<40) {
				kgi++;
			}
			pkg = (kgi*100)/25;
			if(id>maid) {
				maid = id;
				maidkg = kg;
			}
			if(id<meid) {
				meid = id;
				meidkg = kg;
			}
		}
		mh = sh/ih;
		System.out.println("Quantidade de pessoas com idade superior a 50 anos: "+id50+" pessoas");
		System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: "+mh+"cm");
		System.out.println("Porcentagem das pessoas com peso inferior a 40kg: "+pkg+"%");
		System.out.println("Peso da pessoa mais velha: "+maidkg+"kg");
		System.out.println("Peso da pessoa mais nova: "+meidkg+"kg");
		input.close();
	}

}
