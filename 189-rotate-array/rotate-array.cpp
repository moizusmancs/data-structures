class Solution {
public:


    void solve(vector<int> &nums, int start, int end){

        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    void rotate(vector<int>& nums, int k) {        
        int len = nums.size() - 1;

        // if(len <= 1){
        //     return;
        // }

        k = k % (len + 1);

        solve(nums, 0, len);
        // for (int i = 0; i <= len; ++i) {
        //     cout << nums[i] << " ";
        // }

        solve(nums, 0, k - 1);

        solve(nums, k, len);

    }
};