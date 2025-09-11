// 231. Power of Two
// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2x.


class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPowerOfTwo(1));   
        System.out.println(sol.isPowerOfTwo(2));  
        System.out.println(sol.isPowerOfTwo(3));  
        System.out.println(sol.isPowerOfTwo(16));  
        System.out.println(sol.isPowerOfTwo(18));  
    }
}
