class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void solve(int[] nums, int idx, List<List<Integer>> resultList) {
        if (idx == nums.length) {

            List<Integer> current = new ArrayList<>();

            for (int num : nums) {
                current.add(num);
            }

            resultList.add(current);

            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            solve(nums, idx + 1, resultList);
            swap(nums, idx, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        solve(nums, 0, resultList);

        return resultList;
    }
}