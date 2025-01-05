class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
     Arrays.sort(seats);
     Arrays.sort(students);
     int sum=0;
     int val=0;
     for(int i=0;i<seats.length;i++)
     {
        val=0;
       val=Math.abs(seats[i]-students[i]);
        sum+=val;
     }   
     return sum;
    }
}