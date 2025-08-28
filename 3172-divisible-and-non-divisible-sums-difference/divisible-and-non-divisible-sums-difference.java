class Solution {
    public int differenceOfSums(int n, int m) {
        
        // int sum1 = 0 ,sum2 = 0;
        // for(int i=1; i<=n; i++){
        //     if(i%m != 0){
        //         sum1+=i;
        //     }else{
        //         sum2+=i;
        //     }
        // }

        // return sum1-sum2;




       // Approach2
        // int k = n/m;
        // int div = m * (k*(k+1)/2);
        // int notDiv = n*(n+1)/2 - div;
        // int total = notDiv - div;
        // return total;

        int k = n/m;
        return n*(n+1)/2 - k*(k+1)*m;

    
    }
}