import javax.swing.*;

public class exercicio04 {
    public static void main(String[] args) {
        // Fórmula	(P1*0.35 + P2*0.50 + T*0.15)
        double p1, p2, trabalho, calculo;
        try{
            p1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira a nota da P1"));
            p2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira a nota da P2"));
            trabalho = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira a nota do Trabalho"));
            calculo = p1 * 0.35 + p2 * 0.50 + trabalho * 0.15;
            JOptionPane.showMessageDialog(null,"Sua média é: "+calculo);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Não insira letras, somente números");
        }
    }
}
