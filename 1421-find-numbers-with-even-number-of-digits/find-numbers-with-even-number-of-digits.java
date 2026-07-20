class Solution {
    public int findNumbers(int[] nums) {
        
        int twoDigitno =0;

        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            int current=nums[i];
            while(current>0){
                current/=10;
                c++;
            }

            if(c%2==0)
            {
                twoDigitno++;
            }
        }

        return twoDigitno;
        
    }
}