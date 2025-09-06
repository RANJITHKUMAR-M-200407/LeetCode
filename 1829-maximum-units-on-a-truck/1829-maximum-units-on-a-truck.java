class Solution {
    public int maximumUnits(int[][] nums, int truckSize) {
        int copy = truckSize;
        Arrays.sort(nums, (a,b) -> Integer.compare(b[1],a[1]));
       // System.out.println(Arrays.deepToString(nums));
         int ans = 0;
         int ind = 0;
        for(int i=0;i<nums.length;i++){
            int val = truckSize-nums[i][0];
           if(val>0){
            int res = nums[i][0]*nums[i][1];
            ans+=res;
            ind++;
            truckSize = truckSize-nums[i][0];
           }
           else break;
        }
        if(truckSize>=1 && ind<nums.length){
    int mul = truckSize*nums[ind][1];
        ans+=mul;
        }
        // int mul = truckSize*nums[ind][1];
        // ans+=mul;
       // System.out.println(ind+" "+mul);
        return ans;
    }
}