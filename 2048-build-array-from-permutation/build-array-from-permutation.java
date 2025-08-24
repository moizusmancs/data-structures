class Solution {
    public int[] buildArray(int[] nums) {

        // why - (nums[nums[i]]%1000) - if woh element already 1000 se plus howa para to remainder se correct nikaal lena
        for(int i=0; i<nums.length; i++){
            nums[i] += 1000 * (nums[nums[i]]%1000);
        }

         for (int i = 0; i < nums.length; i++) {
            nums[i] /= 1000;
        }
        return nums;

        
    }
}