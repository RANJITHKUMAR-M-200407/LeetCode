class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
       Arrays.sort(nums , (a,b) -> Integer.compare(a[1],b[1]));
       int val = nums[0][1];
       int count=1;
     //  System.out.println(Arrays.deepToString(nums));
       for(int i=1;i<nums.length;i++){
        if(val<=nums[i][0]){
            count++;
            val = nums[i][1];
        }
       }
     //  System.out.print(count);
     return nums.length-count;
    }
}