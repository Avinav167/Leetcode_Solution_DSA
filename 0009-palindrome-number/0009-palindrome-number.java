class Solution {
    public boolean isPalindrome(int x) {
        int ld=0;
        long rev=0;
        int i=x;
        if(x<0){
            return false;
        }
        while(x!=0)
        {
            ld=x%10;
            rev=(rev*10)+ld;
            x=x/10;
        }
        if(i==rev){
            return true;
        }
        
        return false;
    }
}