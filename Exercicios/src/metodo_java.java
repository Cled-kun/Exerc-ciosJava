import java.util.Scanner;

public class metodo_java {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int N = numero.nextInt();

               
        System.out.println(somatorio(N));
    }

           
    static int somatorio(int N) {
        if (N == 0) {
            return 0;
        } else {
            return N + somatorio(N - 1);
        }
    }
        
    }

    
