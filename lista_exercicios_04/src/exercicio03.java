import javax.swing.*;

public class exercicio03 {
    public static void main(String[] args) {
        double valor1, valor2;
        try{
            JOptionPane.showMessageDialog(null, "Coloque dois numeros para multiplicar");

            valor1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 1: "));
            valor2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 2: "));

            JOptionPane.showMessageDialog(null,"O produto entre os numero e: " + multiplicacao(valor1, valor2));

        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Coloque apenas numeros");
        }
    }
    public static double multiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }
}