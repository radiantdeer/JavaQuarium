package lib;

import static org.junit.Assert.*;

public class PiranhaTest {
    @org.junit.Test
    public void getDegOfMovement() throws Exception {
        Piranha p1 = new Piranha();
        assertEquals(p1.getDegOfMovement(), 180);
    }

    @org.junit.Test
    public void setDegOfMovement() throws Exception {
        Piranha p1 = new Piranha();
        p1.setDegOfMovement(90);
        assertEquals(p1.getDegOfMovement(), 90);
    }

}