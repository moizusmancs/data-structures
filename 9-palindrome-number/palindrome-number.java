class Solution {
    public boolean isPalindrome(int x) {

        if (x<0) return false;

        int rev = 0;
        int xc = x;

        while (xc > 0){
            rev = (rev*10) + (xc%10);
            xc /= 10;
        }

        return rev == x;

    }
}