class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                pos.add(nums[i]);
            }
            else
            {
                neg.add(nums[i]);
            }
        }
        for(int i=0;i<pos.size();i++)
        {
            res.add(pos.get(i));
            res.add(neg.get(i));
        }
        int[]arr=new int[res.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=res.get(i);
        }
        return arr;
    }
}