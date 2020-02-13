import java.util.Arrays;
import java.util.Random;
public class Bubblesort2{

    public static void main(String[] args) {
        Random random = new Random(); 
        int[] jada = new int[10];
        for (int i = 0; i < jada.length; i++) {
        jada[i] = random.nextInt(); 
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