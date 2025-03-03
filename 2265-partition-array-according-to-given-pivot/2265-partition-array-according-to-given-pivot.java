class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
         ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]<pivot)  list1.add(arr[i]);
       else if(arr[i]>pivot)  list3.add(arr[i]);
        else if(arr[i]==pivot)  list2.add(arr[i]);
    }
    int[]ans=new int[arr.length];
    int ind=0;
    for (int i = 0; i <list1.size() ; i++) {
        ans[ind++]=list1.get(i);
    }
    for (int i = 0; i <list2.size() ; i++) {
        ans[ind++]=list2.get(i);
    }
    for (int i = 0; i <list3.size() ; i++) {
        ans[ind++]=list3.get(i);
    }
    return ans;
    }
}