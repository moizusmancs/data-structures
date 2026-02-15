class Solution {
    public int countCharacters(String[] words, String chars) {

        HashMap<Character, Integer> map = new HashMap<>();
        

        for (char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int totalLength = 0;
        
        for (String word : words) {
            
            List<Character> usedChars = new ArrayList<>();
            boolean valid = true;
            
            for (char c : word.toCharArray()) {
                
                if (!map.containsKey(c) || map.get(c) == 0) {
                    valid = false;
                    break;
                }
                
                map.put(c, map.get(c) - 1);
                usedChars.add(c);
            }
            
            if (valid) {
                totalLength += word.length();
            }
            
            for (char c : usedChars) {
                map.put(c, map.get(c) + 1);
            }
        }
        
        return totalLength;
        
    }
}