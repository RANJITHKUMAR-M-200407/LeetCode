class Solution {
    public int maximumLength(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        int count1=0;
        int count2=0;
        for(int i=1;i<nums.length;i++){
                  if(nums[i]%2==0)  count1++;
            if(nums[i]%2!=0)  count2++;
            if(nums[i]%2==0 && list.get(list.size()-1)%2!=0)  list.add(nums[i]);
            else if(nums[i]%2!=0 && list.get(list.size()-1)%2==0) list.add(nums[i]);
        }
      if(nums[0]%2==0) count1++;
      else count2++;
        return Math.max(list.size(),Math.max(count1,count2));
    }
}