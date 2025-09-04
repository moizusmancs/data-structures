class Solution {
    public String longestCommonPrefix(String[] strs) {
        

        // if (strs.length == 0) return "";

        // String prefix = strs[0];
        // for(int i=1; i < strs.length; i++){
        //     while(strs[i].indexOf(prefix) != 0){
        //         prefix = prefix.substring(0, prefix.length()-1);

        //         if(prefix.isEmpty()) return "";

        //     }
        // }
        // return prefix;

        if (strs.length == 0) return "";
        return longestPrefix(strs, 0, strs.length-1);
    }

    private String longestPrefix(String[] strs, int start, int end){
        if (start == end){
            return strs[start];
        }else{
            int mid = (start + end) / 2;
            String lcpLeft = longestPrefix(strs, start, mid);
            String lcpRight = longestPrefix(strs, mid+1, end);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    private String commonPrefix(String left, String right){
        int min = Math.min(left.length(), right.length());
        for(int i=0; i<min; i++){
            if(left.charAt(i) != right.charAt(i)){
                return left.substring(0,i);
            }
        }
        return left.substring(0,min);
    }
}