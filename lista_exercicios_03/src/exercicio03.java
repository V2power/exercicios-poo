import javax.swing.*;

public class exercicio03 {
    public static void main(String[] args) {
        int numero, numeroFinal;
        boolean primo;
        try{
            JOptionPane.showMessageDialog(null,"Insira dois números com um intervalo entre eles para que se possa\n achar todos os números primos");
            //Pede o intervalo de números para o usuário
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o número inicial do intervalo"));
            numeroFinal = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o número final do intervalo"));

            //while para passar por cada numero ate o final
            while(numero < numeroFinal){

                //boolean primo para saber se o numero eh primo
                primo = true;

                //se o número dividido por qualquer número de 2 ate um antes dele sempre der resto 1, eh primo
                //se der resto 0 não é primo
                for (int i = 2; i < numero; i++) {
                    if(numero % i == 0){
                        primo = false;
                    }
                }
                //verifica se é primo após sair do for
                if(primo){
                    System.out.println(numero);
                }
                //aumenta o numero
                numero++;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Nao insira letras, somente números");
        }
    }
}