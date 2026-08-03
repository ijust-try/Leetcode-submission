class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max =0;
        int count=0;

        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else count=1;

            if(count>nums.length/2)
            {
                return nums[i];
            }


        }

        return nums[0];

    }
}