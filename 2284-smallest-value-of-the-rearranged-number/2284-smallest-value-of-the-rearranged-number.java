class Solution {
    public long smallestNumber(long num) {
        long copy=num;
        long data1=0;
        long count=0;
        long pos=0;
        ArrayList<Long> arr= new ArrayList<>();
        if(num>0)
        {
         while(num>0)
         {
          data1=num%10;
          if(data1==0)
          {
            count++;
          }
          arr.add(data1);
          num=num/10;
         }
         Collections.sort(arr);
         long[]arr1=new long[arr.size()];
         for (int i = 0; i < arr1.length; i++) {
           arr1[i]=arr.get(i);
         }
         long temp=0;
         if(count>0)
         {
           for (int i = 0; i < arr1.length; i++) {
               if(arr1[i]!=0)
               {
                temp=arr1[i];
                arr1[i]=arr1[0];
                arr1[0]=temp;
               break;
               }
           } 
         }
         for (int i = 0; i < arr1.length; i++) {
             pos=pos*10+arr1[i];
         }
        return pos;
        }
        else if(num<0){
          ArrayList<Long> arr2 = new ArrayList<>();
            long dup=num;
            long chan=num*(-1);
            long data2=0;
            long neg=0;
            while(chan>0)
            {
            data2=chan%10;
            arr2.add(data2);
            chan=chan/10;
            }
            Collections.sort(arr2);
            for(int i=arr2.size()-1;i>=0;i--)
            {
              neg=neg*10+arr2.get(i);
            }
            return neg*(-1);
        } 
        return 0;
    }
}