class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
     HashMap<Integer,String>a=new HashMap<>();
     for(int i=0;i<names.length;i++)   
     {
        a.put(heights[i],names[i]);
     }
     Arrays.sort(heights);
     int k=0;
     for(int i=names.length-1;i>=0;i--)
     {
        names[k]=a.get(heights[i]);
        k++;
     }
     return names;
    }
}