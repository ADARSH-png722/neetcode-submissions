class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int [] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int x = target - n;
            if(hm.containsKey(x)){
                ans[0] = hm.get(x);
                ans[1] = i;
                return ans;
            }
            else{
                hm.put(n,i);
            }
        }
        return ans;
    }
}
