
public class Ex7_Invertido {
    public static void main(String[] args) throws Exception {
       
        int[] vetor = { 1, 5, 50, 82, 16, 61};

        int count = 0;
        System.out.print("vetor é : ");
        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nvetor é : ");
        for (int i = (vetor.length-1); i >= 0; i--) {
            System.out.print(vetor [i] + " ");
        }   
    }
}
