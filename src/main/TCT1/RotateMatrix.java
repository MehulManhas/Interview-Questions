package TCT1;

public class RotateMatrix {
    public void solve(int[][] A) {

        int n = A.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int temp = A[i][j];
                A[i][j] = A[n - 1 - j][n - 1 - i];
                A[n - 1 - j][n - 1 - i] = temp;
            }
        }

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = A[i][j];
                A[i][j] = A[n - 1 - i][j];
                A[n - 1 - i][j] = temp;
            }
        }
    }
}
