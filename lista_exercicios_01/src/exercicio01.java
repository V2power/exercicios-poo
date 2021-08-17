import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite o valor do produto: R$ ");
        double valor = sc.nextDouble();

        double desconto = valor - ((valor * 9) / 100);

        System.out.printf("O valor do %s com desconto é: R$ %.2f", nome, desconto);

        sc.close();
    }
}
