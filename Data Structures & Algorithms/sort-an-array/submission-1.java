class Solution {

    public int[] sortArray(int[] nums) {
        merge(nums, 0, nums.length - 1);
        return nums;
    }

    public static void merge(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        merge(nums, left, mid);
        merge(nums, mid + 1, right);
        mergesort(nums, left, mid, right);
    }

    public static void mergesort(int[] nums, int left, int mid, int right) {

        int[] ans = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

  
        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                ans[k++] = nums[i++];
            } 
            else {
                ans[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            ans[k++] = nums[i++];
        }

        while (j <= right) {
            ans[k++] = nums[j++];
        }
        for (int x = 0; x < ans.length; x++) {
            nums[left + x] = ans[x];
        }
    }
}