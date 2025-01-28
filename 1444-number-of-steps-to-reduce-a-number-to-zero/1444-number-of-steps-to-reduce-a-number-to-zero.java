class Solution {
    public int numberOfSteps(int num) {
        return doo(num,0);
    }
     private static int doo(int num,int count)
    {
        if(num==0)
        {
            return count;
        }
        if(num%2==0)
        {
            return doo(num/2,count+1);
        }
            return doo(num-1,count+1);
        
    }
}