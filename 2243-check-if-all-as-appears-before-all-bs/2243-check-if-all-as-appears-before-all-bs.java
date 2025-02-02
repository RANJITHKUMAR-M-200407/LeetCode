class Solution {
    public boolean checkString(String s) {
      //  boolean flag = false;
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='b')
        {
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(j)=='a')
                {
                  //  flag = true;
                    return false;
                }
            }
            // if(flag)
            // {
            //     break;
            // }
        }
       } 
       return true;
    }
}