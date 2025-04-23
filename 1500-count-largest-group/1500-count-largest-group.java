class Solution {
    public int countLargestGroup(int n) {
        if(n==18)  return 9;
        if(n<=9) return n;
        HashMap<Integer,Integer> map = new HashMap<>();
      int sum=0;
      int val=0;
      for(int i=1;i<=n;i++)
      {
        val=i;
         sum=0;
        if(val>9)
        {
        while(val>0)
        {
       sum+=(val%10);
       val/=10;
        }
       map.put(sum,map.getOrDefault(sum,0)+1);
        }
        else
        {
              map.put(val,map.getOrDefault(val,0)+1);   
        }
      }  
      int max =0;
      for(int i=1;i<map.size();i++)
      {
        if(max<map.get(i)) max = map.get(i);
      }
      int count=0;
      for(int i=1;i<map.size();i++)
      {
        if(map.get(i)==max) count++;
      } 
   //System.out.print(map);
   return count;
    }
}