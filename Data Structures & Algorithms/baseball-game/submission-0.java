class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> ans = new Stack<>();
        int result = 0;
        for(String s : operations){
            if(s.equals("C")){
                ans.pop();
            }
            else if(s.equals("D")){
                int x = ans.peek();
                ans.push(x * 2);
            }
            else if(s.equals("+")){
                int x1 = ans.pop();
                int x2 = ans.peek();
                int x3 = x1 + x2;
                ans.push(x1);
                ans.push(x3);
            }
            else{
                int value = Integer.parseInt(s);
                ans.push(value);
            }
        }
        while(!ans.isEmpty()){
            int x =  ans.pop();
            result += x;
        }
        return result;
    }
}