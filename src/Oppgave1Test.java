import static org.junit.jupiter.api.Assertions.*;

class Oppgave1Test {

    @org.junit.jupiter.api.Test
    void maks() {
        int[] array = {3,4,6,7,3,20,2,10,15,0,2};

        // Kjører maks funksjonen på arrayet
        int maksimum = Oppgave1.maks(array);

        // Sjekker om funksjonen gir det som jeg vil at den skal gi
        assertEquals(20, maksimum);

        // Test for Corner cases = "Spesialtilfeller"


    }
}