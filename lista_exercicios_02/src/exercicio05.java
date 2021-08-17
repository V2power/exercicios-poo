import javax.swing.*;

public class exercicio05 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
        double valor;

        if (idade <= 10) {
            valor = 30.00;
        } else if (idade <= 29) {
            valor = 60.00;
        } else if (idade <= 45) {
            valor = 120.00;
        } else if (idade <= 59) {
            valor = 150.00;
        } else if (idade <= 65) {
            valor = 650;
        } else {
            valor = 400.00;
        }
        final String frase = ("Prezado(a), " + nome + ", você deverá pagar: R$ " + valor + " pelo plano de saúde.");

        JOptionPane.showMessageDialog(null,
                frase,
                "Valores",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
