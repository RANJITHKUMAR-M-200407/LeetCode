class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int i=1;
        int[]arr =new int[3];
        while(true)
        {
         if(memory1>=memory2)
         {
            if(memory1>=i) memory1-=i;
            else break;
         }
         else 
         {
            if(memory2>=i) memory2-=i;
            else break;
         }
        i++;
        }
          arr[0]=i;
        arr[1]=memory1;
        arr[2]=memory2;
      
        return arr;
    }
}