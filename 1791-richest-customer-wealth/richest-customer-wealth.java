class Solution {
    public int maximumWealth(int[][] accounts) {

        int sum =0;
        

        for(int i=0;i<accounts.length;i++)
        {
            int addval=0; 
            for(int j=0;j<accounts[i].length;j++)
            {
                 addval+=accounts[i][j];
            }

            if(addval>=sum)
            {
                sum=addval;
            }
        }

        return sum;
        
    }
}