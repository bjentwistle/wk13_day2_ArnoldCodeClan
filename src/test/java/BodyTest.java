import carcomponents.Body;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BodyTest {

    Body body;

    @Before
    public void setUp(){
        body = new Body("black", "carbon fibre", false);
    }

    @Test
    public void canBeDamaged(){
        assertTrue(body.canBeDamaged()); //confused about this state isDamaged()?? isRepairable()
    }

}
