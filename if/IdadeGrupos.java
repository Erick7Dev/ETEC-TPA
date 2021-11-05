import java.util.Scanner;

public class IdadeGrupos {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int nas, atual, idade;
        System.out.println("Insira ano de nascimento: ");
        nas = input.nextInt();
        System.out.println("Insira ano atual: ");
        atual = input.nextInt();
        idade = atual-nas;
        System.out.println(idade);
        if (idade<10){
            System.out.println("Criança");
        } else if (idade>=10&&idade<18){
            System.out.println("Adolescente");
        } else if (idade>=18&&idade<60){
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
        input.close();
    }

}