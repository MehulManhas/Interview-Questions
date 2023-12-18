package TCT1;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(final int[] A) {
        HashSet<Integer> setOfNums = new HashSet<>();
        int maxLongestSequence = Integer.MIN_VALUE;

        for(int i : A){
            setOfNums.add(i);
        }

        for(int i=0; i<A.length; i++){
            if(!setOfNums.contains(A[i]-1)){
                int num = A[i];
                int longestCurrentSequence = 1;
                while (true){
                    if(setOfNums.contains(num+1)){
                        num++;
                        longestCurrentSequence++;
                    }
                    else {
                        break;
                    }
                }
                maxLongestSequence = Math.max(longestCurrentSequence, maxLongestSequence);
            }
        }

        return maxLongestSequence;
    }
}
