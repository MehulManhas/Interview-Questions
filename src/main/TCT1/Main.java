package TCT1;

public class Main {

    public static void main(String[] args) {
        int[] A = new int[]{18, 33, 100, 135, 203, 270, 292, 310, 356, 392, 400, 429, 436, 461, 427, 403, 399, 375, 251, 245, 173, 130, 43};
        FindPeakElement findPeakElement = new FindPeakElement();
        System.out.println(findPeakElement.solve(A));

        int[] nums = new int[]{100, 4, 200, 1, 2, 3, 5};
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        System.out.println(longestConsecutiveSequence.longestConsecutive(nums));

        String str = "bottle";
        FrequencyBasedSorting frequencyBasedSorting = new FrequencyBasedSorting();
        System.out.println(frequencyBasedSorting.solve(str));


    }
}
