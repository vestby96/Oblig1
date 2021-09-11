import java.util.Arrays;

public class Oppgave5 {

    public static void rotasjon(char[] a){
        // Hjelpevariabel
        char value;

        for (int i = a.length - 1; i > 0; i--) {
            value = a[i];
            a[i] = a[i-1];
            a[i-1] = value;
        }
    }
}
