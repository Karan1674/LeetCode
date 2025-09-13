
// 1009. Complement of Base 10 Integer
// The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
// For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
// Given an integer n, return its complement.


class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0){
            return 1;
        }

        int m = n, mask = 0;
        
        while(m != 0){
            mask = (mask << 1) | 1;
            m = m >> 1;
        }

        int ans = ( ~n ) & mask;
        return ans;
    }

        public static void main(String[] args) {
        Solution solution = new Solution();

        int n1 = 5;
        int n2 = 7;
        int n3 = 10;

        System.out.println("Input: " + n1 + " -> Complement: " + solution.bitwiseComplement(n1)); 
        System.out.println("Input: " + n2 + " -> Complement: " + solution.bitwiseComplement(n2)); 
        System.out.println("Input: " + n3 + " -> Complement: " + solution.bitwiseComplement(n3)); 
    }

}