import javax.swing.*;

public class exercicio02 {
    public static void main(String[] args) {
        int fibonacciAtual = 0,fibonacciAnt = 1, termos = 1,usuarioTermo;

        try{
            //pedir para o utilizador ate qual termo quer que mostre
            usuarioTermo = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de termos da sequencia de fibonacci que deseja: "));

            // fibonacci: atual = atual + anterior; anterior = atual - anterior
            while(termos <= usuarioTermo){
                fibonacciAtual += fibonacciAnt;
                fibonacciAnt = fibonacciAtual - fibonacciAnt;
                System.out.println("termo " + termos + ": "+ fibonacciAtual);
                termos +=1;
            }

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Nao insira letras, somente números");
        }
    }
}
