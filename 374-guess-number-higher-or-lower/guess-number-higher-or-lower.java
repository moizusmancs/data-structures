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
        int right = n;
        int mid = 1;

        while (left <= right){
            mid = left + (right - left)/2;

            int guessNumber = guess(mid);

            switch(guessNumber){
                case 1:
                    left = mid+1;
                    break;
                case -1:
                    right = mid -1;
                    break;
                default:
                    return mid;
            }
        }
        return mid;
        
    }
}