class Solution {
    public void sortColors(int[] nums) {
        int [] ans = new int[nums.length];
        int i = 0, j = nums.length-1;
        for(int x : nums){
            if(x == 0){
                ans[i++] = 0;
            }else if(x == 2){
                ans[j--] = 2;
            }
        }
        while(i<=j){
            ans[i++] = 1;
        }
        for(int k=0;k<nums.length;k++){
            nums[k] = ans[k];
        }
    }
}