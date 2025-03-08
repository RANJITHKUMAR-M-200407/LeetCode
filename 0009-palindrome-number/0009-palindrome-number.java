class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0){
            return false;
        }
     int temp = x;

        int checkValue = 0;
        while(temp!=0){
          int  digit = temp%10;

            // checkValue = digit * 10+checkValue;
            checkValue = checkValue*10+digit;
            temp/=10;
        }
        if(checkValue == x){
            return true;
        }


        return false;
    }
}