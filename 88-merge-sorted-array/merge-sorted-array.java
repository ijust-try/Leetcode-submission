class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int firstArrayPointer = m - 1;
        int secondArrayPointer = n - 1;
        int mergePointer = m + n - 1;

        while (firstArrayPointer >= 0 && secondArrayPointer >= 0) {

            if (nums1[firstArrayPointer] > nums2[secondArrayPointer]) {
                nums1[mergePointer] = nums1[firstArrayPointer];
                firstArrayPointer--;
            } else {
                nums1[mergePointer] = nums2[secondArrayPointer];
                secondArrayPointer--;
            }

            mergePointer--;
        }

        while (secondArrayPointer >= 0) {
            nums1[mergePointer] = nums2[secondArrayPointer];
            secondArrayPointer--;
            mergePointer--;
        }
    }
}