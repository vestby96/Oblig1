import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Oppgave2Test {

    @Test
    void antallUlikeSortert() {
        int[] a = {1,3,5,5,7,7,8,8};

        int ulike = Oppgave2.antallUlikeSortert(a);

        assertEquals(5,ulike);
    }
}