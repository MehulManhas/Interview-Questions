package MockInterview_10_12_2023;

public class Solution {
    public int search(int[] nums, int target) {
        int piviot = findTarget(nums,0, nums.length-1, target);

        return piviot;
    }

    public int findTarget(int[] nums, int left, int right, int target){

        if(left > right){
            return -1;
        }
        int mid = (left + right)/2;

        if(nums[mid] == target){
            return mid;
        }
        if(nums[left] <= nums[mid]){
            if(target >= nums[left] && target <= nums[mid]){
                return findTarget(nums, left, mid-1, target);
            }
            return findTarget(nums, mid+1, right, target);
        }
        if(target >= nums[mid] && target <= nums[right]){
            return findTarget(nums, mid+1, right, target);
        }

        return findTarget(nums, left, mid-1, target);
    }

}
