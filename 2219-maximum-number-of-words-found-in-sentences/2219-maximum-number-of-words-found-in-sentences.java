class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++)
        {
            String[] a=sentences[i].split(" ");
           if(max<a.length) 
           {
            max=a.length;
           }
        }    
        return max;
    }
}