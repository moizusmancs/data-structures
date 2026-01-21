class Solution {
    public int minimumPairRemoval(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i:nums){
            list.add(i);
        }

        int count = 0;

        while (!sorted(list)){
            int index = 0;
            int minSum = Integer.MAX_VALUE;

            for(int i=0; i<list.size()-1; i++){
                int sum = list.get(i) + list.get(i+1);

                if (sum < minSum){
                    minSum = sum;
                    index = i;
                }
            }

            int merge = list.get(index) + list.get(index+1);
            list.set(index, merge);
            list.remove(index+1);
            count++;
        }
        return count;
        
    }

    private boolean sorted(List<Integer> list){
        for (int i=1; i<list.size(); i++){
            if(list.get(i) < list.get(i-1)){
                return false;
            }
        }
        return true;
    }
}