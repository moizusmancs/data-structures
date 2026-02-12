class Solution {
    public int minOperations(String[] logs) {

        int count = 0;

        for(String log : logs){
            if(log.equals("../")){
                count = Math.max(0, count-1);
            
            } else if(!log.equals("./")){
                count++;
            }
        }
        return count;
        
    }
}