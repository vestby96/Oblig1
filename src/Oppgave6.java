import static java.lang.Math.abs;

public class Oppgave6 {

    public static void rotasjon(char[] a, int k){

        if( k >= 0){ // Roterer mot høyre
            for (int i = 0; i < k; i++) {
                char value;
                for (int j = a.length - 1; j > 0; j--) {
                    value = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = value;
                }
            }
        } else { // Roterer mot venstre
            for (int i = 0; i < abs(k); i++){
                char value;
                for(int j = 0; j < a.length - 1; j++){
                    value = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = value;
                }
            }
        }




    }
}
