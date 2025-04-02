class Solution {
    public int triangularSum(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
        list1.add(nums[i]);
        }
         int sum=0;
       while(list1.size()>1)
       {
         sum=0;
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<list1.size()-1;i++)
        {
         sum=(list1.get(i)+list1.get(i+1))%10;
         list2.add(sum);
        }
        list1=list2;
       } 
       System.out.print(list1);
       return list1.get(0);
    }
}