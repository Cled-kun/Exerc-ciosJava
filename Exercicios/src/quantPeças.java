import java.util.Locale;
import java.util.Scanner;

public class quantPeças {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int codigoPeca1 = scan.nextInt();
        int numeroPeca1 = scan.nextInt();
        double valorUnitario1 = scan.nextDouble();

        int codigoPeca2 = scan.nextInt();
        int numeroPeca2 = scan.nextInt();
        double valorUnitario2 = scan.nextDouble();

        double valorAPagar = (valorUnitario1*numeroPeca1) + (valorUnitario2*numeroPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
        
    }
}
