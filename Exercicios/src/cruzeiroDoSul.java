import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class cruzeiroDoSul {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        String nome = scan.next();

        double salario = scan.nextDouble();
        
        double vendas = scan.nextDouble();

        double TOTAL = salario + ((vendas * 15)/ 100);
        
        System.out.printf("TOTAL = R$ %.2f%n", TOTAL);
    }
}
