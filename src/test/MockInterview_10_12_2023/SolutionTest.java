package MockInterview_10_12_2023;
import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {
    private Solution createSolutionObject(){
        return new Solution();
    }

    @Test
    public void testSearchPositiveCase1() {
        Solution solution = createSolutionObject();
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        assertEquals(4, solution.search(nums, target));
    }
    @Test
    public void testSearchPositiveCase2() {
        Solution solution = createSolutionObject();
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 3;
        assertEquals(-1, solution.search(nums, target));
    }
    @Test
    public void testSearchPositiveCase3() {
        Solution solution = createSolutionObject();
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 10;
        assertEquals(-1, solution.search(nums, target));
    }

    @Test
    public void testSearchPositiveCase4() {
        Solution solution = createSolutionObject();
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 2;
        assertEquals(6, solution.search(nums, target));
    }

    @Test
    public void testSearchPositiveCase5() {
        Solution solution = createSolutionObject();
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 4;
        assertEquals(0, solution.search(nums, target));
    }

}