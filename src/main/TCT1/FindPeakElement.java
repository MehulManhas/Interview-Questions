package TCT1;

public class FindPeakElement {
    public int solve(int[] A) {

        int result = binarySearch(A);

        return result;
    }
    public int binarySearch(int[] A){
        int left = 1;
        int right = A.length-2;

        while (left <= right){
            int mid = left + (right - left)/2;

            if(A[mid] > A[mid-1] && A[mid] > A[mid+1]){
                return A[mid];
            }
            else if(A[mid-1] < A[mid] && A[mid] < A[mid+1]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return Math.max(A[0], A[A.length-1]);
    }
}
