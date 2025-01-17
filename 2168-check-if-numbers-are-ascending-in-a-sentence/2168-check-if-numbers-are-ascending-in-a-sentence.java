class Solution {
    public boolean areNumbersAscending(String s) {
       ArrayList<Integer> arr =new ArrayList<>();
        String [] a=s.split(" ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i].matches("\\d+"))
            {
                arr.add(Integer.parseInt(a[i]));
            }
        }
       for(int i=0;i<arr.size()-1;i++)
       {
        if(arr.get(i)>=arr.get(i+1))
        {
            return false;
        }
       }
       return true;  
    }
}