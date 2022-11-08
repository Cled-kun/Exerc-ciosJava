import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;
        
        do{
            System.out.print("numero: ");
            numero = scanner.nextInt();
            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        }   while (count < 5);
        
        System.out.println("O maior é: " + maior);
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + (float)soma/count);
    }
}
