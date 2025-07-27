class Solution {
    public int countHillValley(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
         list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(list.get(list.size()-1)!=nums[i])  list.add(nums[i]);
        }
        System.out.print(list);
        int count=0;
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i-1) > list.get(i) && list.get(i) < list.get(i+1)) count++;
            else if(list.get(i-1) < list.get(i) && list.get(i) > list.get(i+1)) count++;
        }
        return count;
    }
}