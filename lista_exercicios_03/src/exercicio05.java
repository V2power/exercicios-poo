import javax.swing.*;

public class exercicio05 {
    public static void main(String[] args) {
        int i,limite;

        try{
            //pedindo pro usuário colocar o numero limite e o intervalo
            limite = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um numero limite"));
            i = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o número que sera o intervalo ate o limite"));
            for (int j = 0; j <= limite; j += i) {
                System.out.println(j);
            }

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Não insira letras, somente números");
        }
    }
}

