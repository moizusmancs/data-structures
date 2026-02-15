class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> map = new HashMap<>();

        for (char ch:magazine.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        boolean isReproducible = true;
        for(char ch:ransomNote.toCharArray()){
            if(map.get(ch) != null && map.get(ch) > 0){
                map.put(ch, map.get(ch) - 1);
            }else{
                isReproducible = false;
            }
        }
        return isReproducible;
        
    }
}