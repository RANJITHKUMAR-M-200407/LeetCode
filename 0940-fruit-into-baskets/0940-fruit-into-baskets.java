class Solution {
    public int totalFruit(int[] fruits) {
     int max=0,r=0,l=0;
     HashMap<Integer,Integer> map = new HashMap<>();
     while(r<fruits.length)
     {
     map.put(fruits[r],map.getOrDefault(fruits[r],0)+1); 
     if(map.size()>2){
        map.put(fruits[l],map.get(fruits[l])-1);
        if(map.get(fruits[l])==0)   map.remove(fruits[l]);
        l++;
     }
     if(map.size()<=2)  max = Math.max(max,r-l+1);
     r++;

     }   
return max;
    }
}