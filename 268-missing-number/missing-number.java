class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length+1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = -1;
        }

        for(int i : nums){
            arr[i] = i;
        }

        for(int i=0; i<arr.length; i++){
            if (arr[i] == -1){
                return i;
            }
        }

        return -1;
        
    }
}