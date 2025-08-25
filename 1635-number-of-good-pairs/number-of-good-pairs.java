// class Solution {
//     public int numIdenticalPairs(int[] nums) {
        
//         int count = 0;
//         for(int i=0; i<nums.length-1; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     count++;
//                 }
//             }
//         }
//         return count;

//     }
// }

// O(n + k) = O(n)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        // O(n) insertion in map
        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        int totalCount = 0;

        // O(k) map traverse - all keys will be distinct and total keys less than array elements - k<n
        for (int c : freqMap.values()){
            totalCount += c * (c-1) / 2;
        }

        return totalCount;

    }
}
