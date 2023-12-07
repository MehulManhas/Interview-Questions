package IBM_04_12_2023.src;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {

    private Solution createSolutionObject(){
        return new Solution();
    }
    @Test
    public void testGetMinCostPositiveCase1(){
        Solution solution = createSolutionObject();
        int n = 5;
        int k = 7;
        int[][] plans = new int[][]{{1,3, 5, 2}, {1, 4, 5, 3}, {2, 5, 10, 1}};
        assertEquals(44, solution.getMinCost(n, k , plans));
    }
    @Test
    public void testGetMinCostPositiveCase2(){
        Solution solution = createSolutionObject();
        int n = 4;
        int k = 4;
        int[][] plans = new int[][]{{1,4, 4, 5}, {1, 4, 2,5}, {1, 2, 2, 1}, {2, 3, 3, 2}};
        assertEquals(49, solution.getMinCost(n, k , plans));
    }
    @Test
    public void testGetMinCostPositiveCase3(){
        Solution solution = createSolutionObject();
        int n = 4;
        int k = 4;
        int[][] plans = new int[][]{{1,1, 4, 5}};
        assertEquals(20, solution.getMinCost(n, k , plans));
    }

}