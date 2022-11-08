import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);
        
        var fim = false;
        int sim = 1;
        int Não = 2;

        while (fim == false) {
        System.out.println("Tabuada entre 1 a 10: ");
        int tabuada = Scanner.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
            }
        System.out.println("Deseja escolher outro número? (1 - Sim/2 - Não)");
            int outro = Scanner.nextInt();            

            if (outro == 2) {
                System.out.println("Finalizado!");
                fim = true;
        } 
    }
    }
}
