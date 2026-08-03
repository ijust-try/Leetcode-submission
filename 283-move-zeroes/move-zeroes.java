class Solution {
    public void moveZeroes(int[] nums) {

         ArrayList<Integer> numsarr = new ArrayList<>();
        
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                numsarr.add(nums[i]);
            }
        }

        int len = nums.length- numsarr.size();

        for (int i = 0; i < len; i++) {
            numsarr.add(0);
        }

        for(int i=0;i<nums.length;i++)
        {
            nums[i] = numsarr.get(i);
        }

        //return nums;
    }
}