import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do salário mínimo: R$ ");
        Double salarioMinimo = sc.nextDouble();

        System.out.print("Digite o valor do seu salário: R$ ");
        Double salario = sc.nextDouble();

        Double quantidadeDeSalarios = salario / salarioMinimo;
        System.out.printf("Você ganha em torno de %.1f salários mínimos", quantidadeDeSalarios);

        sc.close();
    }
}
