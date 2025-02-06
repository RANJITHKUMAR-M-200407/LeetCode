class Solution {
    public String sortVowels(String s) {
      char[]arr=s.toCharArray();
      ArrayList<Character> list = new ArrayList<>();
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
        {
       list.add(arr[i]);
        }   
      }
      Collections.sort(list);
      StringBuilder b= new StringBuilder();
      int index=0;
      for(int i=0;i<arr.length;i++)
      { if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
         {
            b.append(list.get(index));
            index++;
         }
         else
         {
           b.append(arr[i]);
         }
      }
      return b.toString();
    }
}