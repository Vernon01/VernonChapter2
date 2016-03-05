package Chapter2;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by VERNON on 2016/03/05.
 */
public class TestMethodClassFail extends TestCase {

    private MethodClass methods = new MethodClass();
    private float floatNum = (float) 10.89;

    String equals = new String("equals");

    public void testFloat() throws Exception {
        Assert.assertEquals(floatNum, methods.floats());
    }

    public void testEquality() throws Exception {
        Assert.assertSame(equals,"equals");
    }

    public void testNullVal() throws Exception {
        assertNotNull("s",methods.nullVal());
    }

    public void testNotNull() throws Exception {
        assertNull(methods.notNull());
    }
}
