class Solution {
    public int dayOfYear(String date) {
        String[]arr =date.split("-");
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        int year = Integer.valueOf(arr[0]);
        int month = Integer.valueOf(arr[1]);
        int day=Integer.valueOf(arr[2]); 
        int sum=0;
         for(int i=0;i<month-1;i++)
        {
            sum=sum+days[i];
        }
         sum=sum+day;
         if(month>2 && ((year%4==0 && year%100!=0) || year%400==0))
         {
              return sum+1;
         }
         return sum;
    }
}