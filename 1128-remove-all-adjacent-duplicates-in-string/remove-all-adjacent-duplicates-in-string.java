class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i <= s.length() - 1; i++){
            char ch = s.charAt(i);
            if(st.size() == 0){
            st.push(ch);
           }
            else if(st.peek() == ch){
            st.pop();
            }
             else{
            st.push(ch);
             }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : st){
            ans.append(ch);
        }
        return ans.toString();
    }
}