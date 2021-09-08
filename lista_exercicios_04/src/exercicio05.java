import javax.swing.*;

public class exercicio05 {
    public static void main(String[] args) {
        int valor1,valor2;
        try {
            JOptionPane.showMessageDialog(null,"Coloque dois valores");
            valor1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor 1 :"));
            valor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor 2 :"));
            maiorDeles(valor1, valor2);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Coloque apenas números");
        }
    }
    public static void maiorDeles(int valor1, int valor2) {
        if(valor1 > valor2) {
            JOptionPane.showMessageDialog(null, "O primeiro valor : " + valor1 + " e o maior");
        } else {
            JOptionPane.showMessageDialog(null, "O segundo valor : " + valor2 + " e o maior");
        }
    }
}
