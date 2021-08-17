import javax.swing.*;

public class exercicio04 {
    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

        if (idade < 16) {
            JOptionPane.showMessageDialog(null,
                    "Não-eleitor.",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (idade >= 18 && idade <= 65) {
            JOptionPane.showMessageDialog(null,
                    "Eleitor obrigatório.",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Eleitor facultativo.",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
