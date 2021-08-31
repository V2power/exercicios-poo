import java.util.Scanner;

public class exercicio05 {

    public static final double PI = 3.141592;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a altura da lata de óleo: ");
        double h = sc.nextDouble();
        System.out.print("Digite o raio da lata de óleo: ");
        double R = sc.nextDouble();

        Double volume = PI * Math.pow(R,2) * h;
        System.out.printf("O volume da lata é de: %.2f", volume);

        sc.close();
    }
}
