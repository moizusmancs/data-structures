class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int lastElement = 0;

        for (int num:nums){
            if(count == 0){
                lastElement = num;
            }

            if(num == lastElement){
                count++;
            }else{
                count--;
            }
        }

        return lastElement;
        
    }
}