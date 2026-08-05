class Solution {
    public int heightChecker(int[] heights) {

        int [] sorted = heights.clone();
        Arrays.sort(sorted);
        int c=0;
        for(int i=0;i<sorted.length;i++)
        {
            if(heights[i]!=sorted[i])
            c++;
        }

        return c;
        
        
    }
}