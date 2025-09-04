class Solution {
    public int[] dailyTemperatures(int[] nums) {
      Stack<Integer> st = new Stack<>();
      int i = 0;
      int[] ans = new int[nums.length];
      while(i<nums.length){
        while(!st.isEmpty() && nums[st.peek()]<nums[i]){
            ans[st.peek()] = i-st.pop();
        }
        st.push(i);
       i++;
      }
      return ans;
    }
}