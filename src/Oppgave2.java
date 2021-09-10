public class Oppgave2 {

    public static int antallUlikeSortert(int[] a){
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
}
