import carcomponents.Windows;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WindowsTest {

    Windows windows;

    @Before
    public void setUp(){
        windows = new Windows(true, false, false);

    }

    @Test
    public void hasTintedWindows(){
        assertTrue(windows.getTinted());
    }
}