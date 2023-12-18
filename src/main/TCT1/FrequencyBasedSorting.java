package TCT1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class FrequencyBasedSorting {
    public String solve(String A) {
        int maxCount = Integer.MIN_VALUE;
        int[] charCount = new int[26];
        System.out.println('a' - '0');
        for(char c : A.toCharArray()){
            charCount[c - '0' - 49]++;
            maxCount = Math.max(charCount[c - '0' - 49], maxCount);
        }

        StringBuilder ans = new StringBuilder();

        while (maxCount > 0){
            for(int i=0; i<charCount.length; i++){
                if(charCount[i] == maxCount){
                    for(int j=0; j<charCount[i]; j++){
                        ans.append((char)(i + 49 + '0'));
                    }
                }
            }
            maxCount--;
        }

        return ans.toString();
    }
}
