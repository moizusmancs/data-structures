class Solution {
    public int removeDuplicates(int[] nums) {
        

        int first = 0;
        int second = 1;

        while (second < nums.length){
            if(nums[second] > nums[first]){
                first++;
                int temp = nums[first];
                nums[first] = nums[second];
                nums[second] = temp;
            }
            second++;
        }

        return first+1;

    }
}