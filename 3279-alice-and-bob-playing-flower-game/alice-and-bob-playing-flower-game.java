class Solution {
    public long flowerGame(int n, int m) {

        // long count = 0;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++){

        //         if ((i+j)%2 != 0){
        //             count++;
        //         }

        //     }
        // }

        // return count;
        
        // System.out.println(Math.ceil(3/2));
        // System.out.println(Math.ceil(n/2) * Math.floor(m/2));
        // System.out.println(Math.floor(n/2) * Math.ceil(m/2));

        return (long) ( (Math.ceil(n/2.0) * Math.floor(m/2.0)) + ( Math.floor(n/2.0) * Math.ceil(m/2.0) ) );


        
    }
}