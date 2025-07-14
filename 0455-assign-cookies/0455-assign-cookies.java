class Solution {
    public int findContentChildren(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0;
        int count=0;
        while(i<players.length && j<trainers.length){
           if(j<trainers.length && players[i]>trainers[j]){
            j++;
            continue;
           }
           if((i<players.length && j<trainers.length) && players[i]<=trainers[j]){
            count++;
            i++;
            j++;
            continue;
           }
        }
        return count;  
    }
}