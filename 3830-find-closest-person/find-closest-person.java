class Solution {
    public int findClosest(int x, int y, int z) {
        // if (Math.abs(x-z) == Math.abs(y-z)){
        //     return 0;
        // }else if(Math.abs(x-z) < Math.abs(y-z)){
        //     return 1;
        // }else{
        //     return 2;
        // }

        // why above is a little inefficent, if absolute calculated, why not store it and not calculate again?

        int xz = Math.abs(x-z);
        int yz = Math.abs(y-z);

        if (xz == yz) return 0;

        if(xz<yz) return 1;
        else return 2;
        
    }
}