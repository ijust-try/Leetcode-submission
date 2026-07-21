class Solution {
    public int[] sortedSquares(int[] nums) {

        /*int [] sqnums= new int[nums.length];

        for(int i=0;i<nums.length;i++){
            sqnums[i]= nums[i]*nums[i];
            
        }*/
            int [] sqnums= new int[nums.length];

            int l =0;
            int r = nums.length-1;
            int pos =nums.length-1;

            while(l<=r)
            {
                int ls= nums[l]*nums[l];
                int lr= nums[r]*nums[r];

                if(ls>lr)
                {
                    sqnums[pos]=ls;
                    l++;
                }

                else{
                    sqnums[pos]=lr;
                    r--;
                }

                pos--;
            }

        return sqnums;
        
    }
}