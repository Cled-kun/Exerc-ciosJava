import java.util.Scanner;

public class buscaSequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int valor = leitor.nextInt();
        boolean encontrarValor = false;

        int count = 0;

        while (count < elementos.length - 1 && encontrarValor == false) {
            if (elementos[count] == valor) {
                encontrarValor = true;
            } 
            count++;
        }
        if (encontrarValor == false) {
            System.out.println("Numero " + valor + " nao encontrado!");
        } else{
            System.out.print("Achei " + valor + " na posicao ");    
        }
        for (int posicao = 0; posicao < elementos.length; posicao++) {
            if (valor == elementos[posicao]) {
                System.out.print(posicao);
            }
         }
       }
}
