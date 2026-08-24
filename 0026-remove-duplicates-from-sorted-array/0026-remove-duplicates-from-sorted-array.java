class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 0) {
            return 0;
        }

        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j-1]) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }

        return j;

    }
}