// 7. Reverse Integer
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

import java.util.Scanner;
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int lastDigit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10 )
                return 0;
            rev = (rev * 10) + lastDigit;
            x = x / 10;
        }

        return rev;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        
        System.out.print("Enter an integer to reverse: ");
        int num = sc.nextInt();
        
        int reversed = sol.reverse(num);
        System.out.println("Reversed number: " + reversed);
        
        sc.close();
    }
}