import javax.swing.*;

public class exercicio08 {
    public static void main(String[] args) {
        int valor;
        try {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Coloque um valor para saber se ele e primo"));
            if(primo(valor)){
                JOptionPane.showMessageDialog(null,"E primo");
            }else{
                JOptionPane.showMessageDialog(null,"Nao e primo");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Coloque apenas números");
        }
    }
    public static boolean primo(int valor){
        for (int i = 2; i < valor; i++) {
            if(valor % i == 0){
                return false;
            }
        }
        return true;
    }
}