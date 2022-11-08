import java.util.Random;

public class Ex9_Aleatorio {
  
    public static void main(String[] args) {
        Random random = new Random();

        int[] aleatorio = new int[20];

        for (int i = 0; i < aleatorio.length; i++) {
            int numero = random.nextInt(100);
            aleatorio [i] = numero;
        }
        System.out.print("Números Aleatórios são: ");
        for (int numero : aleatorio) {
            System.out.print(numero + " ");
        }
        System.out.print("\nOs sucessores dos Números Aleatórios são: ");
        for (int numero : aleatorio) {
            System.out.print((numero+1) + " ");
        }
        System.out.print("\nOs antecessores dos Números Aleatórios são: ");
        for (int numero : aleatorio) {
            System.out.print((numero-1) + " ");
        }
    }
}
