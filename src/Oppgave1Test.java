import static org.junit.jupiter.api.Assertions.*;

class Oppgave1Test {

    @org.junit.jupiter.api.Test
    void maks() {
        int[] a = {0,1,2,3,4,5,1,20};

        // Kjører maks funksjonen på arrayet
        // int maksimum = Oppgave1.maks(a);

        // Sjekker om funksjonen gir det som jeg vil at den skal gi
        // assertEquals(20, maksimum);

        // Kjører ombyttinger funksjonen på array
        int count = Oppgave1.ombyttinger(a);

        // Sjekker om funksjonen gir det som jeg vil at den skal gi
        assertEquals(1, count);

    }
}