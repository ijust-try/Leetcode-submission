class Solution {
    public int getNextNum(int number){
        
        int sum=0;
        while(number>0)
        {
            int digit=number%10;
             sum+= digit*digit;
            number/= 10;
        }
        return sum;
        

    }
    public boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while(n!=1){
            if(seen.contains(n)){
                return false;
            }

            seen.add(n);

            n=getNextNum(n);
        }

        return true;

    }
}