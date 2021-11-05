public class Multiplos {
	public static void main(String[] args) {
		int n=1;
		do {
			if (n%10==0) {
				System.out.println(n+" - Múltiplo de 10");
			}else {
				System.out.println(n);
			}
			n++;
		}while (n<=300);
	}

}