class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int [] evenodd = new int[nums.length];
        ArrayList<Integer> even= new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                even.add(nums[i]);
            }

            else
            odd.add(nums[i]);
        }

        for(int i=0;i<even.size();i++)
        {
            evenodd[i]=even.get(i);
        }

            int index = even.size();
         for(int i=0;i<odd.size();i++)
        {
            evenodd[index]=odd.get(i);
            index++;
        }

        return evenodd;
        
    }
}