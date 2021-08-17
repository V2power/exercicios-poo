import javax.swing.*;

public class exercicio02 {
    public static void main(String[] args) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));

        double primeiro = 0;
        double segundo = 0;
        double terceiro = 0;

        if (valor1 > valor2 && valor1 > valor3) {
            primeiro = valor1;
            if (valor2 > valor3) {
                segundo = valor2;
                terceiro = valor3;
            } else {
                segundo = valor3;
                terceiro = valor2;
            }
        } else if (valor2 > valor1 && valor2 > valor3) {
            primeiro = valor2;
            if (valor1 > valor3) {
                segundo = valor1;
                terceiro = valor3;
            } else {
                segundo = valor3;
                terceiro = valor1;
            }
        } else if (valor3 > valor1 && valor3 > valor2) {
            primeiro = valor3;
            if (valor1 > valor2) {
                segundo = valor1;
                terceiro = valor2;
            } else {
                segundo = valor2;
                terceiro = valor1;
            }
        }
        final String valores = (primeiro + " " + segundo + " " + terceiro);

        JOptionPane.showMessageDialog(null,
                "Os valores são: " + valores,
                "Valores",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
