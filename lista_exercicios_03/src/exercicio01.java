import javax.swing.*;

public class exercicio01 {
    public static void main(String[] args) {
        int numeroUsuario1, numeroUsuario2, numeroPar = 0;

        try{
            //Pedir pro usuario colocar os dois numeros de intervalo
            JOptionPane.showMessageDialog(null,"Insira dois números para mostrar\n o intervalo par entre eles");
            numeroUsuario1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número inicial"));
            numeroUsuario2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de final"));

            //descobrir se o numero do usuario de inicio eh par ou nao , e fazer a operacao.
            if((numeroUsuario1 % 2) == 0){
                numeroPar = numeroUsuario1;
                while(numeroPar < numeroUsuario2){
                    numeroPar += 2;
                    System.out.println(numeroPar);
                }

            } else{
                numeroPar = numeroUsuario1 + 1;
                while(numeroPar < numeroUsuario2){
                    System.out.println(numeroPar);
                    numeroPar += 2;
                }
            }

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Não insira letras, somente números");
        }
    }
}
