class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i <= s.length() - 1; i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(ch == '*'){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        if(st.size() == 0){
            return "" ;
        } 
        StringBuilder ans = new StringBuilder();
        for(char ch : st){
            ans.append(ch);
        }
        return ans.toString();
    }
}