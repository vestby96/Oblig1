import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Oblig1Test {

    @Test
    void maks() {

        int[] a = {0,1,2,3,4,5,1,20};

        // Kjører maks funksjonen på arrayet
        int maksimum = Oppgave1.maks(a);

        // Sjekker om funksjonen gir det som jeg vil at den skal gi
        assertEquals(20, maksimum);
    }

    @Test
    void ombyttinger() {

        int[] a = {0,1,2,3,4,5,1,20};

        // Kjører ombyttinger funksjonen på array
        int count = Oppgave1.ombyttinger(a);

        // Sjekker om funksjonen gir det som jeg vil at den skal gi
        assertEquals(1, count);
    }

    @Test
    void antallUlikeSortert() {

        int[] a = {1,3,5,5,7,7,8,8};

        int ulike = Oppgave2.antallUlikeSortert(a);

        assertEquals(5,ulike);
    }

    @Test
    void antallUlikeUsortert() {

        int[] a = {1,7,3,5,3,6,1};

        int ulike = Oppgave3.antallUlikeUsortert(a);

        assertEquals(5,ulike);
    }

    @Test
    void delsortering() {

    }

    @Test
    void rotasjon() {
    }

    @Test
    void testRotasjon() {
    }

    @Test
    void flett() {
    }

    @Test
    void testFlett() {
    }

    @Test
    void indekssortering() {
    }

    @Test
    void tredjeMin() {
    }

    @Test
    void bokstavNr() {
    }

    @Test
    void inneholdt() {
    }
}