public class Oppgave3 {

    public static int antallUlikeUsortert(int[] a){
        int antUlike = 0;

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
}
