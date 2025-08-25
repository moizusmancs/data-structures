class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        

        // int count = 0;

        // for (int i=0; i<jewels.length(); i++){
        //     for(int j=0; j<stones.length(); j++){
        //         if(jewels.charAt(i) == stones.charAt(j)){
        //             count++;
        //         }
        //     }
        // }

        // return count;


        Map<Character,Integer> mp = new HashMap<>();

        for(char ch: jewels.toCharArray()){
            mp.put(ch,0);
        }

        for(char ch : stones.toCharArray()){

            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);
            }

        }

        int tc=0;
        for(Integer val: mp.values()){
            tc+=val;
        }

        return tc;

    }
}