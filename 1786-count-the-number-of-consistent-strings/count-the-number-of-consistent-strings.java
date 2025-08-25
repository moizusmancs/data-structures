class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (Character c: allowed.toCharArray()){
            map.put(c,0);
        }

        for(int i=0; i<words.length; i++){

            Boolean skip = false;
            for(Character ch: words[i].toCharArray()){
                if(!map.containsKey(ch)){
                    skip = true;
                    break;
                }
            }
            if(!skip){
                count++;
            }

        }

        return count;
        
    }
}