// 191. Number of 1 Bits
// Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).


public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            int bit = n & 1;  
            if (bit == 1) count++;
            n = n >>> 1;
        }
        return count;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 11;   
        int n2 = 128;  
        int n3 = -3;   

        System.out.println(sol.hammingWeight(n1));
        System.out.println(sol.hammingWeight(n2));
        System.out.println(sol.hammingWeight(n3));
    }
}
