class Solution {
    public int countCommas(int n) {
        // if(n <= 999) return 0;

        // // Formula n - 1000 + 1
        // return n - 1000 + 1;

        return Math.max(0, n - 999);
    }
}