////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
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

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        int antUlike = 1;

        if (a.length == 0){
            antUlike = 0;
        } else {
            for (int i = 0; i < a.length - 1; i++){
                int j = i + 1;

                if (a[i] > a[j]){
                    throw new IllegalStateException("The array must be sorted in ascending order");
                } else if (a[i] != a[j]){
                    antUlike++;
                }
            }
        }
        return antUlike;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {int antUlike = 0;

        // Denne loopen tar for seg en og et tall for å sammenligne med
        // alle andre tall som ligger til "venstre" på tabellen
        for (int i = 0; i < a.length; i++)
        {
            // Her defineres j utenfor loopen fordi den skal brukes flere steder
            int j;
            for (j = 0; j < i; j++){
                // Dersom et tall er likt et annet tall som ligger til "venstre" på tabellen
                // betyr det at tallet allerede er telt og loopen brytes for å så ta for seg neste tall
                if (a[i] == a[j]){
                    break;
                }
            }

            // Dersom tallet ikke er telt, blir det telt her
            if (i == j){
                antUlike++;
            }
        }

        return antUlike;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1