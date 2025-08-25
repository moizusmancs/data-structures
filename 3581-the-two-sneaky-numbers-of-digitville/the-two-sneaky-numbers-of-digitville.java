class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        // Map<Integer, Integer> map = new HashMap<>();

        // for(Integer num: nums){

        //     map.put(num, map.getOrDefault(num,0)+1);

        // }

        // int[] arr = new int[2];
        // int idx = 0;
        // for(Map.Entry<Integer, Integer> val: map.entrySet()){
        //     if(val.getValue() > 1){
        //         arr[idx] = val.getKey();
        //         idx++;
        //     }
        // }

        // return arr;

        int arr[] = new int[2]; //1
        Arrays.sort(nums); // nlogn
        int idx = 0; //1

        // n
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                arr[idx] = nums[i];
                idx++;
            }
        }

        // nlogn
        return arr;




        
    }
}