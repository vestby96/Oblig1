import org.junit.jupiter.api.Test;

class Oppgave7Test {

    @Test
    void flett() {

        String a = Oppgave7.flett("ACEGH","BDF");
        System.out.println(a);
    }

    @Test
    void flettB(){

        String a = Oppgave7.flettB("AM ","L","GEDS","ORATKRR","","R TRTE","IO","TGAUU");
        System.out.println(a);
    }
}