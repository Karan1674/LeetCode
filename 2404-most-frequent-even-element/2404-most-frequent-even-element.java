class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            if(num % 2 ==0){
                freq.put(num , freq.getOrDefault(num, 0) + 1);
            }
        }

        int ans = -1;
        int maxCount = 0;

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){

            int num = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                ans = num;
            }
            else if (count == maxCount && num < ans) {
                ans = num;
            }
        }

        return ans;
    }
}