// 1. Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.


import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = sol.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
