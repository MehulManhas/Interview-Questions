package IBM_04_12_2023.src;

public class Main {
    public static void main(String[] args) {

        //TC1
        int n = 5;
        int k = 7;
        int[][] plans = new int[][]{{1,3, 5, 2}, {1, 4, 5, 3}, {2, 5, 10, 1}};
        Solution solution = new Solution();
        System.out.println(solution.getMinCost(n, k, plans));

        //TC2
        int n1 = 4;
        int k1 = 4;
        int[][] plans1 = new int[][]{{1,4, 4, 5}, {1, 4, 2,5}, {1, 2, 2, 1}, {2, 3, 3, 2}};
        Solution solution1 = new Solution();
        System.out.println(solution1.getMinCost(n1, k1, plans1));

        //TC3
        int n2 = 4;
        int k2 = 4;
        int[][] plans2 = new int[][]{{1,1, 4, 5}};
        Solution solution2 = new Solution();
        System.out.println(solution1.getMinCost(n2, k2, plans2));
    }
}