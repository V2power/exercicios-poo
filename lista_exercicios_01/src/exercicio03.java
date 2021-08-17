import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        Float primeiroValor = sc.nextFloat();

        System.out.print("Digite o segundo valor: ");
        Float segundoValor = sc.nextFloat();

        float media = (primeiroValor + segundoValor) / 2;
        System.out.println("A média dos valores é: " + media);

        sc.close();
    }
}
