import java.util.Scanner;

public class horasDoDia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Que horas são: ");
        double hora = scan.nextFloat();

        if (hora <= 12) {
            System.out.println("Bom dia!");
        } else if (hora <= 17) {
            System.out.println("Boa tarde!");
        } else if (hora <= 24) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Hora Inválida");
        }
    }
}
