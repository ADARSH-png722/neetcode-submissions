class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap <Integer,Integer> hm = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],1) + 1);
      }
      int [] ans = new int[k];
     for(int i=0;i<k;i++){
        int max = 0;
        int value = 0;
        for(int x : hm.keySet()){
            if(hm.get(x) > max){
                max = hm.get(x);
                value = x;
            }
        }
        hm.remove(value);
        ans[i] = value;
     }
     return ans;
    }

}
