class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(int i=0;i<operations.length;i++)
        {
            String temp=operations[i];
            if(temp.equals("X++") ||temp.equals("++X"))
            {
                 count++;
            }
            else
            {
                count--;;
            }
        }
        return count;
    }
}