class Solution {
    public int countPairs(List<Integer> nums, int target) {

        // int pairs = 0;
        // for(int i=0; i<nums.size()-1; i++){
        //     for(int j=i+1; j<nums.size(); j++){
        //         if((i < j) && (nums.get(i) + nums.get(j) < target)){
        //             pairs++;
        //         }
        //     }
        // }

        // return pairs;

        Collections.sort(nums);
        int low=0, high = nums.size()-1, pairs=0;

        while (low < high){
            if(nums.get(low) + nums.get(high) < target){
                pairs+= high - low;
                low++;
            }else{
                high--;
            }
        }

        return pairs;


        
    }
}