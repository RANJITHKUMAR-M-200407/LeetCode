class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String word:arr)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        int ind=0;
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])==1)
            {
                ind++;
            }
            if(ind==k)
            {
                return arr[i];
            }
        }
        return"";
    }
}