class Solution {
    public long flowerGame(int n, int m) {
        return (long) ( (Math.ceil(n/2.0) * Math.floor(m/2.0)) + ( Math.floor(n/2.0) * Math.ceil(m/2.0) ) );     
    }
}