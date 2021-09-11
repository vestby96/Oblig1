import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Oppgave5Test {

    @Test
    void rotasjon() {
        char[] a = {'a','b','c','d','e'};

        Oppgave5.rotasjon(a);
        System.out.println(Arrays.toString(a));
    }
}