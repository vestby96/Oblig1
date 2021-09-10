import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Oppgave3Test {

    @Test
    void antallUlikeUsortert() {

        int[] a = {1,7,3,5,3,6,1};

        int ulike = Oppgave3.antallUlikeUsortert(a);

        assertEquals(5,ulike);
    }
}