class Solution {
    public boolean isPalindrome(int x) {
         if(x<0)
            return false;
        long rev=0;
        int i=x;
       
        while(x>0)
        {
            int ld=x%10;
            rev=(rev*10)+ld;
            x=x/10;
        }
        return (rev==i);
    }
}