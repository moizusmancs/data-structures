class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int leftEnd = m-1;
        int rightEnd = n-1;
        int combinedEnd = n+m-1;

        while (rightEnd >= 0){
            if (leftEnd >=0 && nums1[leftEnd] > nums2[rightEnd]){
                nums1[combinedEnd--] = nums1[leftEnd--];
            }else{
                nums1[combinedEnd--] = nums2[rightEnd--];
            }
        }
    }
}