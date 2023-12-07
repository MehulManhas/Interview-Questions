package IBM_04_12_2023.src;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public int getMinCost(int n, int k, int[][] plans){

        Arrays.sort(plans, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[3] != o2[3]){
                    return Integer.compare(o1[3], o2[3]);
                }
                return Integer.compare(o1[0], o2[0]);
            }
        });

        int currentDay = 1;
        int totalCost = 0;


        while (currentDay <= n){
            int totalCores = 0;
            for(int i=0; i<plans.length; i++){
                int startDay = plans[i][0];
                int endDay = plans[i][1];
                int cores = plans[i][2];
                int cost = plans[i][3];


                if(startDay <= currentDay && currentDay <= endDay){
                    if(k > totalCores + cores){
                        totalCost += cores * cost;
                        //k -= cores;
                        totalCores += cores;
                    }
                    else{
                        totalCost += (k - totalCores) * cost;
                        //k -= (k - totalCores);
                        totalCores += (k - totalCores);
                    }
                }

                if (totalCores == k) {
                    break;
                }
            }
            currentDay++;
        }
        return totalCost;
    }
}
