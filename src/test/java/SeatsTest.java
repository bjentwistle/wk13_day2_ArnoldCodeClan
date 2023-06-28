import carcomponents.Seats;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatsTest {

    Seats seats;

    @Before
    public void setUp(){
        seats = new Seats ("black/grey", "5");
    }

    @Test
    public void hasSeatscolour(){
        assertEquals("black/grey", seats.getColour());
    }

    @Test
    public void hasSeatNumber(){
        assertEquals("5", seats.getSeatNumber());
    }

}
