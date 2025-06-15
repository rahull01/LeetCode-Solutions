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