package TCT2;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class NextGreaterTest extends TestCase {

    public NextGreater createNextGreaterObject(){
        return new NextGreater();
    }
    @Test
    public void testNextGreaterPositive1() {
        int[] A = new int[]{4,5,2,10};
        int[] ans = new int[]{5,10,10,-1};
        NextGreater nextGreater = createNextGreaterObject();
        Assert.assertArrayEquals(ans, nextGreater.nextGreater(A));
    }
    @Test
    public void testNextGreaterPositive2() {
        int[] A = new int[]{3,2,1};
        int[] ans = new int[]{-1,-1,-1};
        NextGreater nextGreater = createNextGreaterObject();
        Assert.assertArrayEquals(ans, nextGreater.nextGreater(A));
    }
    @Test
    public void testNextGreaterPositive3() {
        int[] A = new int[]{39,27,11,4,24,32,32,1};
        int[] ans = new int[]{-1,32,24,24,32,-1,-1,-1};
        NextGreater nextGreater = createNextGreaterObject();
        Assert.assertArrayEquals(ans, nextGreater.nextGreater(A));
    }
}