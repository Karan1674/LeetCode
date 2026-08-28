class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posIndex = 0, negIndex = 1;
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[posIndex] = nums[i];
                posIndex += 2;
            } else {
                result[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return result;
    }
}