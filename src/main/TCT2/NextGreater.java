package TCT2;

import java.util.Stack;

public class NextGreater {
    public int[] nextGreater(int[] A) {

        int[] ans = new int[A.length];

        Stack<Integer> numStack = new Stack<>();

        for(int i=A.length-1; i>=0; i--){
            if(numStack.isEmpty()){
                numStack.push(A[i]);
                ans[i] = -1;
            }
            else {
                while (!numStack.isEmpty() && numStack.peek() <= A[i]) {
                    numStack.pop();
                }

                if (numStack.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = numStack.peek();
                }

                numStack.push(A[i]);
            }
        }

        return ans;
    }
}
