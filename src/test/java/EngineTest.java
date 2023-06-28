import carcomponents.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp(){

        engine = new Engine("1.5", "300");
    }

    @Test
    public void canStartEngine(){
        assertEquals("Engine started", engine.canStart());
    }
    @Test
    public void canStopEngine(){
        assertEquals("Engine stopped", engine.canStop());
    }



}
