class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> hs = new HashSet<>();
        boolean ans = false;
        for(int i : nums){
            if(!hs.contains(i)){
                hs.add(i);
            }else {
                ans = true;
                return ans;
            }
        }
        return ans;
    }
}