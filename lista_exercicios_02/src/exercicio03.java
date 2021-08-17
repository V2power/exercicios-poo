import javax.swing.*;

public class exercicio03 {
    public static void main(String[] args) {

        double valorDoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: R$ "));
        double lucro = 0;

        if (valorDoProduto < 20) {
            lucro = valorDoProduto + ((valorDoProduto * 45) / 100);
        } else
            lucro = valorDoProduto + ((valorDoProduto * 30) / 100);

        JOptionPane.showMessageDialog(null,
                "O valor da venda é de: R$ " +lucro,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
