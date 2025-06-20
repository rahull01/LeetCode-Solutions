/*
 * Problem: 344. Reverse String
 * Difficulty: Easy
 *
 * Description:
 * Write a function that reverses a string.
 * The input string is given as an array of characters 's'.
 *
 * You must reverse the input array in-place with O(1) extra memory.
 *
 * Example 1:
 * Input:  s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Example 2:
 * Input:  s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 * Constraints:
 * - 1 <= s.length <= 10^5
 * - s[i] is a printable ASCII character.
 */

class Solution {
    public void reverseString(char[] s)
    {
        int fPointer = 0;
        int lPointer = s.length - 1;
        while(fPointer < lPointer)
        {
            char temp = s[fPointer];
            s[fPointer] = s[lPointer];
            s[lPointer] = temp;

            fPointer++;
            lPointer--;  
        }
    }
}

/* Using Recursion------->

class Solution {
    public void reverseString(char[] s) {
        recur(s,0);
    }
     public void recur(char[] s, int index)
     {
        if(index == s.length/2)
        
            return;
         recur(s,index+1);
        swap(s,index,s.length-index-1);
     }
     public void swap(char[] s,int i,int j)
     {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
     }
}