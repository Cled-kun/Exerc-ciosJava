import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        var fim = false;
        int Sim = 1;
        int Não = 2;

        while (fim == false) {
            System.out.println("Fatorial de: ");
        int fatorial = scanner.nextInt();

        int mutiplicacao = 1;
        System.out.print(fatorial + "!= ");

        for (int i = fatorial; i >=1 ; i--) {
            mutiplicacao = mutiplicacao * i;
        }
        System.out.println(mutiplicacao);

        System.out.println("Deseja fazer novamente? 1 - Sim / 2 - Não");
        int outro = scanner.nextInt();
        if (outro == 2) {
            fim = true;
            System.out.println("Finalizado!");
        }
    }    

    }
}
