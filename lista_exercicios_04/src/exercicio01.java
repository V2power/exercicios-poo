import javax.swing.*;

public class exercicio01 {
    public static void main(String[] args) {
        int numero;

        try{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um numero: "));
            JOptionPane.showMessageDialog(null,"O dobro do número digitado é: " +dobro(numero));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Não insira letras, somente números");
        }
    }
    public static int dobro(int n1) {
        return n1 * 2;
    }
}
