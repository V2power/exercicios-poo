import javax.swing.*;

public class exercicio06 {
    public static void main(String[] args) {
        int mesTrimestre;
        try{
            mesTrimestre = Integer.parseInt(JOptionPane.showInputDialog(null," Escreva algum mes do primeiro trimestre em numeros"));
            trimestre(mesTrimestre);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Escreva em numero o mes que deseja");
        }
    }
    public static void trimestre(int mesTrimestre){
        switch(mesTrimestre){
            case 1:
                JOptionPane.showMessageDialog(null, "Janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Fevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Marco");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Coloque um mes do primeiro trimestre");
        }
    }
}
