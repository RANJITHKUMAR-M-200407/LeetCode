class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        int k=colors.length;
       for(int i=0;i<colors.length;i++)
       {
        if(colors[i%k] != colors[(i+1)%k] && colors[(i+1)%k] != colors[(i+2)%k])
        count++;
       } 
       return count;
    }
}