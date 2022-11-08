import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int quantNumeros;
        int quantPares = 0, quantImpares = 0;
        int numeroPar;
        int numeroImpar;
        
        System.out.println("Quantidade de números: ");
        quantNumeros = scanner.nextInt();

        int count = 0;

        do{
            System.out.println("Número: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;
            
            count = count + 1;
            
        } while (count < quantNumeros);

        System.out.println("Quantidade de Par: " + quantPares);
        System.out.println("Quantidade de Ímpar: " + quantImpares);
    }
}
