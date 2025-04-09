class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int[][]arr = new int[score.length][score[0].length];
        int ind=0;
        ArrayList<Integer> list = new ArrayList<>();
        int j=0;
        int val=0;
        while(j<score.length)
        {
            int max=0;
          for(int i=0;i<score.length;i++)
      {
          if(!list.contains(score[i][k]) && max<score[i][k])
          {
          max=score[i][k];
          val=i;
          } 
      } 
    //   System.out.println(max);
    //   System.out.println(score[val][k]);
      list.add(score[val][k]);
      for(int i=0;i<score[0].length;i++)
      {
       arr[ind][i]=score[val][i];
      }
      ind++;
      j++;
        }
        return arr;
    }
}