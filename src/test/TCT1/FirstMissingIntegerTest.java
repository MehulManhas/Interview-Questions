package TCT1;

import junit.framework.TestCase;
import org.junit.Test;

public class FirstMissingIntegerTest extends TestCase {

    @Test
    public void testFirstMissingPositiveCase1() {
        int[] A = new int[]{1,2,0};
        FirstMissingInteger firstMissingInteger = new FirstMissingInteger();
        assertEquals(3, firstMissingInteger.firstMissingPositive(A));
    }
    @Test
    public void testFirstMissingPositiveCase2() {
        int[] A = new int[]{3,4,-1,1};
        FirstMissingInteger firstMissingInteger = new FirstMissingInteger();
        assertEquals(2, firstMissingInteger.firstMissingPositive(A));
    }
    @Test
    public void testFirstMissingPositiveCase3() {
        int[] A = new int[]{-8,-7,-6};
        FirstMissingInteger firstMissingInteger = new FirstMissingInteger();
        assertEquals(1, firstMissingInteger.firstMissingPositive(A));
    }
}