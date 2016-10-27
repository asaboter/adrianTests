

import org.testng.annotations.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by adrian.sabo on 26.10.2016.
 */
public class firstSimpleTest {
    @Test
    public void firstSimpleTest() {
        assertTrue("Result not equals to 4", 2 * 2 == 4);
    }
}
