class Solution {
    public boolean isHappy(int n) {

        Set<Integer> visit = new HashSet<>();

        while (!visit.contains(n)){
            visit.add(n);
            n = getN(n);
            if(n==1){
                return true;
            }
        }
        return false;
        
    }

    private int getN(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum+= digit*digit;
            n/=10;
        }
        return sum;
    }
}