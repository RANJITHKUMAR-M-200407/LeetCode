class Solution {
    public int[] evenOddBit(int n) {
       String b = Integer.toBinaryString(n);
       ArrayList<Integer> list = new ArrayList<>();
       int ind=0;
       for(int i=b.length()-1;i>=0;i--)
       {
        if(b.charAt(i)=='1') list.add(ind);
         ind++;
       } 
       int[]arr = new int[2];
       int even =0;
       int odd=0;
       for(int i=0;i<list.size();i++)
       {
        if(list.get(i)%2==0) even++;
        else odd++;
       }
       arr[0]=even;
       arr[1]=odd;
       return arr;
    }
}