import java.util.Arrays;

public class Oppgave7 {

    public static String flett(String s, String t){
        // Variabel som funksjonen skal returnere
        String f = "";
        // Hjelpevariabel
        int i;

        // Deler opp i to operasjoner:
        // Der jeg først fletter inn begge stringene
        if (s.length() > t.length()){
            for (i = 0; i < t.length(); i++) {
                f += s.charAt(i);
                f += t.charAt(i);
            }
            // Når den korteste stringen er "tom" legges resterende chars til på enden
            for (int j = i; j < s.length(); j++){
                f += s.charAt(j);
            }
        } else {
            for (i = 0; i < s.length(); i++) {
                f += s.charAt(i);
                f += t.charAt(i);
            }
            for (int j = i; j < t.length(); j++){
                f += t.charAt(j);
            }
        }


        return f;
    }

}
