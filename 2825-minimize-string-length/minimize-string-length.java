class Solution {
    public int minimizedStringLength(String s) {

        int[] dis = new int[26];
        int ans = 0;

        for (int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';

            if(dis[idx] == 0){
                dis[idx] = 1;
                ans++;
            }
        }

        return ans;
        
    }
}