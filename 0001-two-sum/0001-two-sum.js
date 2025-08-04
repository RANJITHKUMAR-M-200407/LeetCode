/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const ans =[];
    for(let i=0;i<nums.length;i++){
        for(let j=0;j<nums.length;j++){
            if(i!=j && nums[i]+nums[j]==target)
            {
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
        }
    }
    return ans;
};