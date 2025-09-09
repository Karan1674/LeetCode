// 9. Palindrome Number
// Given an integer x, return true if x is a palindrome, and false otherwise.


class Solution {
    public boolean isPalindrome(int x) {

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return reversed == x;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int num = 121;
        System.out.println(num + " is palindrome? " + sol.isPalindrome(num));
    }
}
