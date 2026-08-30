class Solution {
public void swap (int[] nums, int val1,int val2){
int temp= nums[val1];
nums[val1] = nums[val2];
nums[val2] = temp;
}

    public void sortColors(int[] nums) {
        int low = 0, high = nums.length-1, mid = 0;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, high, mid);
                high--;
            }
        }
    }
}