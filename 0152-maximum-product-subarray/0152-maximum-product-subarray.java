class Solution {
    public int maxProduct(int[] nums) {
         int max1=nums[0];
        int prod1=1;
        int max2=nums[nums.length-1];
        int prod2=1;
        for (int i = 0; i < nums.length; i++) {
            prod1=prod1*nums[i];
            if(prod1>max1)
            {
                max1=prod1;
            }
            if(prod1==0)
            {
                prod1=1;
            }
        }
        for (int i = nums.length-1; i >=0; i--) {
            prod2=prod2*nums[i];
            if(prod2>max2)
            {
                max2=prod2;
            }
            if(prod2==0)
            {
                prod2=1;
            }
        }
            return (int)(Math.max(max1, max2));
        
    }
}