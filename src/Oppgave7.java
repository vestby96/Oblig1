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

    public static String flettB(String... s){
        // "f" samler tegnene og returneres til slutt
        String f = "";

        // Finner den lengste lengden av stringene
        int lengsteS = s[0].length();
        for(int i = 1; i < s.length; i++) {
            if(s[i].length() > lengsteS) {
                lengsteS = s[i].length();
            }
        }

        // Variabel "i" brukes til å finne et tegn, brukes som charAt(i)
        int i;
        for (i = 0; i < lengsteS; i++) {
            // Variabel "j" brukes til å finne et ord, brukes som s[j]
            int j;
            for (j = 0; j < s.length; j++) {
                // Skjekker om variabelen "i" er innefor parameteret for lengden på hvert ord
                if (s[j].length() > i){
                    // Finner et spesifikt tegn
                    char tegn = s[j].charAt(i);
                    // Legger til tegnet i f
                    f += tegn;
                }
            }

        }
        return f;
    }

}
