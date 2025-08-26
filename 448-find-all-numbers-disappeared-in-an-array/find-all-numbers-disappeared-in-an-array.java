class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // Map<Integer, Integer> mp = new HashMap<>();

        // List<Integer> li = new ArrayList<>();

        // for(Integer i : nums){
        //     mp.put(i, mp.getOrDefault(i,0)+1);
        // }

        // for(int i=1; i<=nums.length; i++){
        //     if(!(mp.containsKey(i))){
        //         li.add(i);
        //     }
        // }

        // return li;

        int n = nums.length;
        int i = 0;

        while(i<n){
            int currIndex = nums[i]-1;
            if(i != currIndex && nums[currIndex] != nums[i]){
                int temp = nums[i];
                nums[i] = nums[currIndex];
                nums[currIndex] = temp;
            }else{
                i++;
            }
        }

        List<Integer> li = new ArrayList<>();
        for(int j=0; j<n; j++){
            if(nums[j] != j+1){
                li.add(j+1);
            }
        }
        
        return li;
    }
}