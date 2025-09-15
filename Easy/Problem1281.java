// 1281. Subtract the Product and Sum of Digits of an Integer
// Given an integer number n, return the difference between the product of its digits and the sum of its digits.


public class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n / 10;
        }
        return product - sum;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 234;  
        int n2 = 4421; 

        System.out.println(sol.subtractProductAndSum(n1));
        System.out.println(sol.subtractProductAndSum(n2));
    }
}
