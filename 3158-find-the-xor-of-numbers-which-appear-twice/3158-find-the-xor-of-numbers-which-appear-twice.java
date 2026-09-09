class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int result= 0;
        for (int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                continue;
            }
            else{
                for ( int j = i + 1; j< nums.length; j++){
                    if ( nums[j] == nums[i]){
                        result = result ^ nums[i];
                        nums[j] = 0;
                        nums[i] =0;
                        break;
                    }
                }
            }
        }

        return result;
    }
}