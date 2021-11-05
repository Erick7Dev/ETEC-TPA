import java.util.Scanner;

public class GastoMedio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, l, gm;
        System.out.println("Insira a distância percorrida(em km):");
        km = input.nextInt();
        System.out.println("Insira a quantidade de combústivel gasto(em litros):");
        l = input.nextInt();
        gm = km/l;
        if (gm>=10) {
            System.out.println("Seu gasto médio é de "+gm+"km/l, seu carro é econômico.");
        } else {
            System.out.println("Seu gasto médio é de "+gm+"km/l, seu carro NÃO é econômico.");
        }
        input.close();

    }
}