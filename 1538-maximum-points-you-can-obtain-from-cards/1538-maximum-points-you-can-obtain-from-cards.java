class Solution {
    public int maxScore(int[] arr, int k) {
  int ls=0;
  for(int i=0;i<k;i++)
  {
    ls+=arr[i];
  }
  int rs =0;
  int max =ls;
  int ind=arr.length-1;
  while(k>0)
  {
    rs = arr[ind];
  ls-=arr[k-1];
  ls+=rs;
  max = Math.max(max,ls);
  k--;
  ind--;
  }
  return max;
    }
}