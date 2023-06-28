import carcomponents.EntertainmentSystem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EntertainmentSystemTest {

    EntertainmentSystem entertainmentSystem;

    @Before
    public void setUp(){
        entertainmentSystem = new EntertainmentSystem("DAB", "TomTom", false);
    }

    @Test
    public void hasRadio(){
        assertEquals("DAB", entertainmentSystem.getRadio());
    }

    @Test
    public void hasSatNav(){
        assertEquals("TomTom", entertainmentSystem.getSatNav());
    }

    @Test
    public void hasBluetooth(){
        assertFalse(entertainmentSystem.getBluetooth());
    }

    @Test
    public void canTurnRadioOn(){
        assertEquals("Radio is on", entertainmentSystem.canTurnRadioOn());
    }

    @Test
    public void canTurnRadioOff(){
        assertEquals("Radio is off", entertainmentSystem.canTurnRadioOff());
    }

    @Test
    public void canConnectBluetooth(){
        assertEquals("Bluetooth is connected", entertainmentSystem.canConnectBluetooth());
    }

    @Test
    public void canDisconnectBluetooth(){
        assertEquals("Bluetooth is disconnected", entertainmentSystem.canDisconnectBluetooth());
    }

    @Test
    public void canGiveDirections(){
        assertEquals("Turn left up ahead", entertainmentSystem.canGiveDirections());
    }

}
