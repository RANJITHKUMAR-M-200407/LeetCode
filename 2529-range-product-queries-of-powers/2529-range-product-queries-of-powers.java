class Solution {
    public int[] productQueries(int n, int[][] queries) {
     String a = Integer.toBinaryString(n);
     int[]arr = new int[queries.length];
     ArrayList<Integer> list = new ArrayList<>();
     int count=0;
     for(int i=a.length()-1;i>=0;i--){
        if(a.charAt(i)=='1'){
            int val = (int)Math.pow(2,count);
            list.add(val);
        }
        count++;
     }   
     long sum=0;
     int mod=1000000007;
     for(int i=0;i<queries.length;i++){
        sum=1;
        for(int j=queries[i][0];j<=queries[i][1];j++){
           sum=(sum*list.get(j))%mod;
        }
       arr[i]=(int)sum;
     }
     return arr;
    }
}