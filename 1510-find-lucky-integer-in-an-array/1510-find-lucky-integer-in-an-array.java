class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey()==entry.getValue()) max = Math.max(max,entry.getKey());
        }
        if(max==0) return -1;
  return max;

    }
}