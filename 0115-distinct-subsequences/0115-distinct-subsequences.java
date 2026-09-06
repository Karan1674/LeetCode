class Solution {
    public int numDistinct(String s, String t) {
        long[][] dp = new long[s.length()][t.length()];

        for(long[] row :  dp) {
            java.util.Arrays.fill(row, -1);
        }
        
        return (int) solve(s, t, 0, 0, dp);
    }

    private long solve(String s, String t, int i, int j, long[][] dp){

        if(j == t.length()) return 1;

        if(i == s.length()) return 0;


        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) == t.charAt(j)){
            long pick = solve(s, t, i + 1, j + 1, dp);
            long skip = solve(s, t, i + 1, j, dp);

            return  dp[i][j] = pick + skip;
        }

        long skip = solve(s, t, i + 1, j, dp);
        return dp[i][j] = skip;
    }
}