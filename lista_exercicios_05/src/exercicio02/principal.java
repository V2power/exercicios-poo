package exercicio02;
import javax.swing.*;
public class principal {
    public static void main(String[] args) {
        try{
            Equacao equacao = new Equacao();
            equacao.setA(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor A: ")));
            equacao.setB(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor B: ")));
            equacao.setC(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor C: ")));

            if (equacao.delta() == 0){
                System.out.println(equacao.delta());
                JOptionPane.showMessageDialog(null,"Raízes iguais");
                JOptionPane.showMessageDialog(null,"A área do triângulo (+): " + equacao.R1());
                JOptionPane.showMessageDialog(null,"A área do triângulo (-): " + equacao.R2());
            }
            else if (equacao.delta() < 0) {
                System.out.println(equacao.delta());
                JOptionPane.showMessageDialog(null,"Não existem raízes reais");
            }
            else {
                System.out.println(equacao.delta());
                JOptionPane.showMessageDialog(null,"Existem 2 raízes diferentes");
                JOptionPane.showMessageDialog(null,"A área do triângulo (+): " + equacao.R1());
                JOptionPane.showMessageDialog(null,"A área do triângulo (-): " + equacao.R2());
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Não insira letras, somente números");
        }
    }
}
