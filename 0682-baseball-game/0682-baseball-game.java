class Solution {
    public int calPoints(String[] nums) {
         Stack<Integer> st = new Stack<>();
        int n1=0;
        int n2=0;
        int n3=0;
        for(int i=0;i<nums.length;i++)
        {
           if (!st.isEmpty() && nums[i].equals("+"))
            {
             n1=st.pop();
             n2=n1+st.peek();
             st.push(n1);
             st.push(n2);
            }
           else if (!st.isEmpty() && nums[i].equals("C"))
            {
                st.pop();
            }
           else if (!st.isEmpty() && nums[i].equals("D"))
            {
             st.push(st.peek()*2); 
            }
            else
            {
                st.push(Integer.valueOf(nums[i]));
            }
        }
        int sum=0;
        while(!st.isEmpty())
        {
            sum=sum+st.pop();
        }
        return sum; 
    }
}