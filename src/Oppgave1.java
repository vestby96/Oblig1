import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oppgave1 {

    public static void main(String[] args){
        int[] array = {20,3,4,6,7,3,2,10,15,0,2};

        // Skriver ut det siste og høyeste tallet i arrayet
        System.out.println("Highest value in array : " + maks(array));
    }

    public static int maks(int[] a) {

            // Sorterer array slik at det største tallet ender sist
            for (int i = 0; i < a.length - 1; i++) {
                int j = i + 1;
                // Dersom et tall i arrayet er større enn det neste tallet, vil de to tallene bytte plass
                if (a[i] > a[j]) {
                    // Bytter plass på tallene
                    int value = a[i];
                    a[i] = a[j];
                    a[j] = value;
                }
            }

            return a[a.length - 1];

    }
}
