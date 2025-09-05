/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int left = 1;
        while (left <= n){
            int mid = left + (n - left)/2;

            int guessNumber = guess(mid);

            switch(guessNumber){
                case 1:
                    left = mid+1;
                    break;
                case -1:
                    n = mid -1;
                    break;
                default:
                    return mid;
            }
        }
        return -1;
        
    }
}