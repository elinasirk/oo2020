package app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Tests {

    final Ions ion1 = new Ion("vesinik", 1.008, 1);
    final Ions ion2 = new Ion("lämmastikushape", 62.0049, -1);

    @Test
    public void test1() {
        assertEquals(1.008, ion1.getMolecularMass(), 0.01);
    }

    @Test
    public void test2() {
        assertEquals(62.0049, ion2.getMolecularMass(), 0.01);
    }

    @Test
    public void test3() {
        assertEquals(1, ion1.getCharge(), 0.01);
    }

    @Test
    public void test4() {
        assertEquals(-1, ion2.getCharge(), 0.01);
    }
    
}
