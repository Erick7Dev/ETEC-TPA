import java.util.Scanner;
public class AlturaWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double jh=134, ph=145, ano=0;
		while (jh<=ph) {
			jh = jh+2.5;
			ph = ph+2;
			ano++;
		}
		System.out.println("João irá demorar "+ano+" anos para ficar mais alto que Pedro");
		input.close();
	}
}
