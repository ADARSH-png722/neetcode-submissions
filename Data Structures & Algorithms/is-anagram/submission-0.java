class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans = true;
        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character,Integer> hm = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            if(hm.containsKey(ch)){
               int n = hm.get(ch);
               if(n == 1){
                hm.remove(ch);
               }else{hm.put(ch,n-1);}
            }
            else {
                ans = false;
                return ans;
            }
        }
        return ans;
    }
}
