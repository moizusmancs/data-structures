class Solution {
    public int maxFreqSum(String s) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        Map<Character, Integer> map = new HashMap<>();

        for (Character ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        int maxV = 0;
        int maxC = 0;

        for (Character ch : vowels){
            Integer item = map.get(ch);

            if(item != null){
                maxV = Math.max(maxV,item);
                map.remove(ch);
            }
        }

        for (Integer val : map.values()){
            maxC = Math.max(maxC, val);
        }

        return maxC+maxV;
        
    }
}