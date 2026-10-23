class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int repeated = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int num = grid[i][j];

                if (set.contains(num)) {
                    repeated = num;
                }

                set.add(num);
                sum += num;
            }
        }

        int expectedSum = total * (total + 1) / 2;

        int missing = expectedSum + repeated - sum;

        return new int[] { repeated, missing };
    }
}