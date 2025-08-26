class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Map<Integer, Integer> mp = new HashMap<>();

        List<Integer> li = new ArrayList<>();

        for(Integer i : nums){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }

        for(int i=1; i<=nums.length; i++){
            if(!(mp.containsKey(i))){
                li.add(i);
            }
        }

        return li;
        
    }
}