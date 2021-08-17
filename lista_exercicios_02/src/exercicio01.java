import javax.swing.*;

public class exercicio01 {
    public static void main(String[] args) {
        double cont = 1;
        System.out.println("Digite '0' para finalizar o programa.");

        while (cont != 0) {
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));

            if (valor % 3 == 0) {
                JOptionPane.showMessageDialog(null,
                        "O valor é múltiplo de 3",
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "O valor não é múltiplo de 3",
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            cont = valor;
        }
    }
}
