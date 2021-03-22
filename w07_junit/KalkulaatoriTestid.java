import org.junit.*;

import static org.junit.Assert.*;

public class KalkulaatoriTestid {
    KalkulaatoriLiides k = new Kalkulaator();
    @Before
    public void puhasta() {
        k.vajutus("C");
    }
    @Test
    public void sisestus1() {
        assertEquals("0", k.kuvatav());
        k.vajutus("2");
        assertEquals("2", k.kuvatav());
    }
    @Test
    public void sisestus2() {
        k.vajutus("3");
        k.vajutus("5");
        assertEquals("35", k.kuvatav());
    }
    @Test
    public void sisestus3() {
        k.vajutus("2");
        k.vajutus("0");
        k.vajutus("0");
        k.vajutus("5");
        assertEquals("2005", k.kuvatav());
        k.vajutus("C");
        assertEquals("0", k.kuvatav());
    }
    @Test
    public void sisestus4() {
        k.vajutus("3");
        k.vajutus("+");
        assertEquals("3", k.kuvatav());
        k.vajutus("2");
        assertEquals("2", k.kuvatav());
        k.vajutus("=");
        assertEquals("5", k.kuvatav());
    }
    @Test
    public void sisestus5() {
        k.vajutus("8");
        assertEquals("8", k.kuvatav());
        k.vajutus("C");
        assertEquals("0", k.kuvatav());
        k.vajutus("2");
        k.vajutus("**");
        assertEquals("2", k.kuvatav());
        k.vajutus("3");
        assertEquals("3", k.kuvatav());
        k.vajutus("=");
        assertEquals("8", k.kuvatav());
    }
    @Test
    public void sisestus6() {
        //kraadides, mitte radiaanides
        k.vajutus("90");
        k.vajutus("sin");
        assertEquals("0.8939966636005579", k.kuvatav());
    }
}