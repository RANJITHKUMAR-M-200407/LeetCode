class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> list = new ArrayList<>();
        String[]arr=text.split(" ");
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i].equals(first) && arr[i+1].equals(second))
            {
                list.add(arr[i+2]);
            }
        }
        String[] str=new String[list.size()];
        for(int i=0;i<str.length;i++)
        {
            str[i]=list.get(i);
        }
        return str;
    }
}