import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oppgave1 {

    public static void main(String[] args){
        int[] a = {0,1,2,3,4,5,1,20};

        // Skriver ut det siste og høyeste tallet i arrayet
        System.out.println("Highest value in array : " + maks(a));

        System.out.println("number of switches : " + ombyttinger(a));
    }

    public static int maks(int[] a) {

        // Tester om arrayet har 0 objekter
        if (a.length == 0) {
            throw new NoSuchElementException("Can not find max value, the array is empty");
        } else {
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


    public static int ombyttinger(int[] a) {
        // Lager en int som skal telle antall bytter som blir gjennomført
        int count = 0;
        // Tester om arrayet har 0 objekter
        if (a.length == 0) {
            throw new NoSuchElementException("The array is empty");
        } else {
            // Sorterer array slik at det største tallet ender sist
            for (int i = 0; i < a.length - 1; i++) {
                int j = i + 1;
                // Dersom et tall i arrayet er større enn det neste tallet, vil de to tallene bytte plass
                if (a[i] > a[j]) {
                    // Bytter plass på tallene
                    int value = a[i];
                    a[i] = a[j];
                    a[j] = value;
                    // Teller byttet
                    count++;
                }
            }
            return count;
        }
    }
}