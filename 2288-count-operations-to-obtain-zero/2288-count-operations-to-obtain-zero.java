class Solution {
    public int countOperations(int num1, int num2) {
        int count = 0;
        if(num1==num2 && num1!=0) return 1;
        if(num1==0 && num2==0) return 0;
        while(true){
            if(num1<=0 || num2<=0) break;
            count++;
           if(num1>num2){
            num1-=num2;
           }
           else if(num2>num1){
            num2-=num1;
           }
           else break;
        }
        return count;
    }
}