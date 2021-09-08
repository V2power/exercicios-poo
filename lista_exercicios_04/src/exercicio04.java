import javax.swing.*;

public class exercicio04 {
    public static void main(String[] args) {
        double grau;
        try {
            JOptionPane.showMessageDialog(null, "Insira o grau para calcular o radiano");
            grau = Double.parseDouble(JOptionPane.showInputDialog(null, "Grau: "));
            JOptionPane.showMessageDialog(null, "O radiano e: " + radiano(grau));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Coloque apenas números");
        }
    }
    //  radiano = grau * pi / 180
    public static double radiano(double grau){
        return grau * Math.PI / 180;
    }
}