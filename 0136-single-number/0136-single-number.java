class Solution {
    public int singleNumber(int[] nums) {
        int xorNum =0;

        for (int i = 0; i < nums.length; i++){
            xorNum = xorNum ^ nums[i];
        }

        return xorNum;
    }
}