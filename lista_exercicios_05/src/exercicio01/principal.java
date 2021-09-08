package exercicio01;
import javax.swing.*;

public class principal {
    public static void main(String[] args) {
        try {
            Triangulo triangulo = new Triangulo();
            triangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da base: ")));
            triangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da altura: ")));
            JOptionPane.showMessageDialog(null,"A área do triângulo: " + triangulo.areaTriangulo());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Não insira letras, somente números");
        }
    }
}
