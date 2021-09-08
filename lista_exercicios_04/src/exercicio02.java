import javax.swing.*;

public class exercicio02 {
    public static void main(String[] args) {
        double n1, n2, n3, n4;
        try{
            n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota: "));
            n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota: "));
            n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota: "));
            n4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota: "));

            JOptionPane.showMessageDialog(null,"A média aritmética dos números é: " + media(n1,n2,n3,n4));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Não insira letras, somente números");
        }
    }
    public static double media(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }
}
