class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (Character c: allowed.toCharArray()){
            map.put(c,0);
        }

        for(int i=0; i<words.length; i++){

            Boolean ok = true;
            for(Character ch: words[i].toCharArray()){
                if(!map.containsKey(ch)){
                    ok = false;
                    break;
                }
            }
            if(ok){
                count++;
            }

        }

        return count;
        
    }
}