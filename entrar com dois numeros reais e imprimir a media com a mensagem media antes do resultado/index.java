import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite outro número");
        int num2 = sc.nextInt();

        int media = (num1 + num2) / 2;

        System.out.println("A média de " + num1 + " e " + num2 + " é igual a " + media);
    }
}