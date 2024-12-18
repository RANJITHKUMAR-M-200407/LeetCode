class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> b= new HashMap<>();
        String c=new String();
     for(int i=0;i<indices.length;i++)
     {
      b.put(indices[i],s.charAt(i)); 
     }  
     for(int i=0;i<b.size();i++)
     {
        c=c+b.get(i);
     }
     return c;
    }
}