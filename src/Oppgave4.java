import java.util.Arrays;

public class Oppgave4 {

    public static void delsortering(int[] a){
        // Hjelpe var for å flytte på verdiene
        int left = 0;
        int value;

        // Sorter array i stigende rekkefølge
        for (int n = 0; n < a.length; n++) {
            for (int m = n + 1; m < a.length; m++) {
                if(a[n] > a[m]) {
                    value = a[n];
                    a[n] = a[m];
                    a[m] = value;
                }
            }
        }

        // Flytt alle oddetall til venstre del av array

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0){
                value = a[left];
                a[left] = a[i];
                a[i] = value;
                left++;
            }
        }
        // Sorterer Partallene igjen
        for (int n = 0; n < a.length; n++) {
            if (a[n] % 2 == 0){
                for (int m = n + 1; m < a.length; m++) {
                    if(a[n] > a[m]) {
                        value = a[n];
                        a[n] = a[m];
                        a[m] = value;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
