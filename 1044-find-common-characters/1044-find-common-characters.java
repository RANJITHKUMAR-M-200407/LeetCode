class Solution {
    public List<String> commonChars(String[] words) {
        int[] arr1 = new int[26];
        String a = words[0];
        for(int i=0;i<a.length();i++)
        {
            arr1[a.charAt(i)-'a']++;
        } 
        System.out.println(Arrays.toString(arr1));
        for(int i=1;i<words.length;i++)
        {
            int[] arr2 = new int[26];
            String b = words[i];
            for(int j=0;j<b.length();j++)
            {
             arr2[b.charAt(j)-'a']++;
            }
            if(!Arrays.equals(arr1,arr2))
            {
                for(int k=0;k<arr2.length;k++)
                {
                    if(arr1[k]!=0 && arr1[k]!=arr2[k] && arr1[k]>arr2[k])
                    {
                        arr1[k]=Math.min(arr1[k],arr2[k]);
                    }
                }
            }
        }
        System.out.print(Arrays.toString(arr1));
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>0)
            {
             for(int j=0;j<arr1[i];j++)
            {
               list.add(String.valueOf((char)(i+'a')));
            }
            }
           
        }
        return list;
    }
}