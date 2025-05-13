class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
       // if(Arrays.equals(fruits,baskets)) return 0;
        int count=0;
      for(int i=0;i<fruits.length;i++)
      {
        boolean flag = false;
        for(int j=0;j<fruits.length;j++)
        {
            if(fruits[i]<=baskets[j]) 
            {
                flag = true;
                baskets[j]=0;
                break;
            }
        }
        if(!flag)  count++;
      }
      return count;
    }
}