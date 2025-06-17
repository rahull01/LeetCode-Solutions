/*
 ** Problem: Check if a Number is a Sum of Distinct Powers of Three
 **
 ** Description:
 ** Given an integer n, the task is to determine whether it is possible to represent n
 ** as the sum of distinct powers of three.
 **
 ** Explanation:
 ** A number y is a power of three if there exists an integer x such that y == 3^x.
 **
 ** The solution uses the fact that any number that can be represented as a sum of
 ** distinct powers of three will have a ternary (base 3) representation containing only 0s and 1s.
 ** If the ternary representation contains a digit '2', it means that number cannot be
 ** represented as sum of distinct powers of three.
 **
 ** Examples:
 ** Input: n = 12
 ** Output: true
 ** Explanation: 12 = 3^1 + 3^2 (i.e., 3 + 9)
 **
 ** Input: n = 91
 ** Output: true
 ** Explanation: 91 = 3^0 + 3^2 + 3^4 (i.e., 1 + 9 + 81)
 **
 ** Input: n = 21
 ** Output: false
 **
 ** Constraints:
 ** 1 <= n <= 10^7
 **
 ** Approach:
 ** - Convert n to base 3.
 ** - Check each digit in the base 3 representation.
 ** - If any digit is 2, return false (not representable as sum of distinct powers of 3).
 ** - Otherwise, return true.
 **
 ** Time Complexity: O(log n) because of repeated division by 3.
 **
 ** This is an efficient and elegant way to solve the problem without enumerating all powers.
 */
class Solution {
    public boolean checkPowersOfThree(int n)
    {
         while(n > 0)
         {
            int rem = n%3;
            if(rem == 2)return false;
            n = n/3;
         }
         return true;
    }
}