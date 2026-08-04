class Solution {
    public int pivotIndex(int[] nums) {
        
        
        
            for(int i=0;i<nums.length;i++)
        {
            int suml=0;
            int sumr=0;

            for(int j=0; j<i;j++)
            {
                suml=suml+nums[j];
            }

            for(int k=i+1; k<nums.length;k++)
            {
                sumr= sumr+nums[k];
            }

            if(sumr==suml)
        return i;

        }
        
        return -1;
        
    }
}