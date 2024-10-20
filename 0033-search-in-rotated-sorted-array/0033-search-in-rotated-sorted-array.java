class Solution {
    public int search(int[] nums, int target) {
         int ans=value(nums,target);
         if(ans==-1)
         {
            return bs(nums,target,0,nums.length-1);
         }
         if(nums[ans]==target)
         {
          return ans;
         }
         if(target>=nums[0])
         {
          return bs(nums,target,0,ans-1);
         }
          return bs(nums,target,ans+1,nums.length-1);
    }

        static int bs(int[]nums,int target,int start,int end)
{
  while(start<=end)
  {
  int middle=start+(end-start)/2;
  if(target<nums[middle])
  {
     end=middle-1;
  }
 else if(target>nums[middle])
  {
  start=middle+1;
  }
else
  {
    return middle;
  }
}
return -1;
}
static int value(int[]nums,int target)
{
  int start=0;
  int end=nums.length-1;
  while(start<=end)
  {
      int mid=start+(end-start)/2;
      if(mid<end && nums[mid]>nums[mid+1] )
      {
       return mid;
      }
      if(mid>start && nums[mid]<nums[mid-1])
      {
        return mid-1;
      }
      if(nums[mid]<=nums[start])
      {
          end=mid-1;
      }
      else{
        start=mid+1;
      }
  }
  return -1;
}
    
}