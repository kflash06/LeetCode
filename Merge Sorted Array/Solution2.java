class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
        } else if (n != 0){
            int[] copy = Arrays.copyOfRange(nums1, 0, m);
            int c1 = 0, c2 = 0;
            for (int i = 0; i < nums1.length; i++) {
                if (c2 == nums2.length) {
                    c2--;
                    nums2[c2] = Integer.MAX_VALUE;
                }
                if (c1 == copy.length) {
                    c1--;
                    copy[c1] = Integer.MAX_VALUE;
                }
                if (copy[c1] > nums2[c2]) {
                    nums1[i] = nums2[c2++];
                } else {
                    nums1[i] = copy[c1++];
                }
            }
        }
    }
}