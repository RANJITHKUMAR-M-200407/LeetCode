class Solution {
    public String frequencySort(String s) {
        int[]arr = new int[256];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        arr[Integer.valueOf(s.charAt(i))]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        String a ="";
        for(int i=list.size()-1;i>=0;i--)
        {
            int freq=list.get(i);
         for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == freq) {
                    for (int j = 0; j < freq; j++) {
                        a += entry.getKey();
                    }
                    map.remove(entry.getKey()); 
                    break;
        }
         }
         }   
         return a;
    }
}
