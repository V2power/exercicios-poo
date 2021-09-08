import javax.swing.*;

public class exercicio07 {
    public static void main(String[] args) {
        int valorFatorial;
        try {
            valorFatorial = Integer.parseInt(JOptionPane.showInputDialog(null,"Coloque o numero que você quer fatorar: "));
            JOptionPane.showMessageDialog(null,"O fatorial de " + valorFatorial + " e " + fatorial(valorFatorial));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Coloque apenas numeros");
        }
    }
    //Fatorial de 5 = 5 x 4 x 3 x 2 x 1 = 120
    public static int fatorial(int valor1){
        int total = valor1;
        while(valor1 > 1){
            total = total * (valor1 - 1);
            System.out.println(total);
            valor1 -= 1;
        }
        return total;
    }
}

