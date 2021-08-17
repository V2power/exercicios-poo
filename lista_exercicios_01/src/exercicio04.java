import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        Double fahrenheit = (9 * celsius + 160) / 5;
        System.out.printf("A temperatura convertida para Fahrenheit é: %.2f", fahrenheit);
        sc.close();
    }
}
