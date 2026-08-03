class Solution {
    public int[] plusOne(int[] digits) {

        
        int c = digits.length-1;
        if(digits[c]!=9)
        {
            digits[c]++;
            return digits;
        }

         while(c>=0 && digits[c]==9)
         {
            digits[c]=0;
            c--;

            
            
         }

        if(c>=0){
                digits[c]++;
                return digits;
            }
            
        int[] ans = new int[digits.length+1];
        ans[0]=1;
         return ans;

        
    }
}