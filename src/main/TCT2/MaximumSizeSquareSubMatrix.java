package TCT2;

public class MaximumSizeSquareSubMatrix {
    public int solve(int[][] A) {

        if(A.length == 0){
            return 0;
        }
        if(A.length == 1 || A[0].length == 1){
            return 1;
        }
        int[][] copyOfArr = new int[A.length][A[0].length];
        int max = Integer.MIN_VALUE;

        for(int i=0; i<A.length; i++){
            copyOfArr[i][0] = A[i][0];
        }

        for(int j=0; j<A[0].length; j++){
            copyOfArr[0][j] = A[0][j];
        }

        for(int i=1; i<A.length; i++){
            for(int j=1; j<A[i].length; j++){
                if(A[i][j] == 1){
                    copyOfArr[i][j] = Math.min(copyOfArr[i][j-1], Math.min(copyOfArr[i-1][j], copyOfArr[i-1][j-1])) + 1;
                }
                else{
                    copyOfArr[i][j] = 0;
                }

                max = Math.max(copyOfArr[i][j], max);
            }
        }


        return max*max;
    }
}
