import java.util.Arrays;

public class Oppgave4 {

    public static void delsortering(int[] a){

        int begin = 0;
        int end = a.length - 1;
        int value;

        for (int i = 0; i < a.length; i++) {

            // True hvis partall, false hvis oddetall
            if (a[i] % 2 == 0){
                value = a[end];
                a[end] = a[i];
                a[i] = value;
                end--;
            }

        }

        System.out.println(Arrays.toString(a));
    }
}
