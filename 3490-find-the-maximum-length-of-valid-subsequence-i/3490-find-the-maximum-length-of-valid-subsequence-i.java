class Solution {
    public int maximumLength(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2==0 && list.get(list.size()-1)%2!=0)  list.add(nums[i]);
            else if(nums[i]%2!=0 && list.get(list.size()-1)%2==0) list.add(nums[i]);
        }
         for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)  list1.add(nums[i]);
            else  list2.add(nums[i]);
        }
        return Math.max(list.size(),Math.max(list1.size(),list2.size()));

       // return list.size();
        
    }
}