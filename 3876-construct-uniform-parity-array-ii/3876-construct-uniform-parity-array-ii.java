class Solution {
    public boolean uniformArray(int[] nums) {
        int min = nums[0];
        boolean allEvens = true;

        for(int num : nums){

            min = Math.min(num,min);

            if(num%2 != 0){
                allEvens = false;
            }
        }

        return min % 2 != 0 || allEvens;
    }
}