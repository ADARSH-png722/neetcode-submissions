class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        boolean one = true;
        boolean two = false;
        int i = 0,j=0;
        while(i < word1.length() && j < word2.length()){
            if(one){
                char ch = word1.charAt(i);
                i++;
                ans = ans + ch;
                one = false;
                two = true;
            }
            else{
                 char ch = word2.charAt(j);
                j++;
                ans = ans + ch;
                one = true;               
                two = false;
            }
        }
        while (i < word1.length()) {
            ans = ans + word1.charAt(i);
            i++;
        }

        while (j < word2.length()) {
            ans = ans + word2.charAt(j);
            j++;
        }
        return ans;
    }
}