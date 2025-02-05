class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char[]arr1=s1.toCharArray();
        char[]arr2=s2.toCharArray();
        int count=0;
        int ind1=0;
        int ind2=0;
        if(Arrays.equals(arr1,arr2)) return true;
        for(int i=0;i<arr1.length;i++)
        {
          if(arr1[i]!=arr2[i]){
            count++;
            if(count==1) ind1=i;
            if(count==2) ind2=i;
          }   
        }

        if(count==2 && arr1[ind2]==arr2[ind1] && arr1[ind1]==arr2[ind2]) return true;
        return false;
    }
}