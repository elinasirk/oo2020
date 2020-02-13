import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Bubblesort2{

    public static void main(String[] args) {
        Random random = new Random(); 
        Scanner in = new Scanner(System.in);
        System.out.println("Kui palju arve soovid: ");
        int b = in.nextInt();
        int[] jada = new int[b];
        for (int i = 0; i < jada.length; i++) {
        jada[i] = random.nextInt(10000); 
        }
        System.out.println("Sorteerimata jada: "+ Arrays.toString(jada));
        int loendur = 0;
        for (int i = 0; i < jada.length; i++) {
        boolean sorteeritud  = true;
        for (int j = 1; j < (jada.length - i); j++) {
            if (jada[j - 1] > jada[j]) {
                loendur += 1;
                int temp = jada[j - 1];
                jada[j - 1] = jada[j];
                jada[j] = temp;
                sorteeritud = false;
            }
        }
        if (sorteeritud) break;    
    }
    System.out.println("Sorteeritud jada: "+ Arrays.toString(jada));
    System.out.println("Sorteeriti "+ loendur + " korda.");
}
}