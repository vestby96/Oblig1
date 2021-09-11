import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Oppgave6Test {

    @Test
    void rotasjon() {
        char[] a = {'a','b','c','d','e','f','g'};

        Oppgave6.rotasjon(a,2);
        System.out.println(Arrays.toString(a));
    }
}