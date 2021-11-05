import java.util.Scanner;

public class Imc {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        float kg, h, imc;
        System.out.println("Insira seu peso:");
        kg = input.nextFloat();
        System.out.println("Insira sua altura:");
        h = input.nextFloat();
        imc = kg/(h*h);
        if (imc<18.5){
            System.out.printf("Seu IMC é de %.2f, e é classificado como excesso de magreza.%n", (imc));
        } else if (imc>=18.5&&imc<25){
            System.out.printf("Seu IMC é de %.2f, e é classificado como peso normal.%n", (imc));
        } else if (imc>=25&&imc<30){
            System.out.printf("Seu IMC é de %.2f, e é classificado como excesso de peso.%n", (imc));
        } else if (imc>=30&&imc<35){
            System.out.printf("Seu IMC é de %.2f, e é classificado como obesidade (Grau I).%n", (imc));
        } else if (imc>=35&&imc<=40){
            System.out.printf("Seu IMC é de %.2f, e é classificado como obesidade (Grau II).%n", (imc));
        } else if (imc>40){
            System.out.printf("Seu IMC é de %.2f, e é classificado como obesidade (Grau III).%n", (imc));
        }
        input.close();
    }
    
}