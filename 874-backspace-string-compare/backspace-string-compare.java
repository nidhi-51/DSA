class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(st.isEmpty()){
                    continue;
                }
                else{
                    st.pop();
                }
            }
           else{
            st.push(ch);
           }
        }
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(ch == '#'){
                if(st2.isEmpty()){
                    continue;
                }
                else{
                    st2.pop();
                }
            }
            else{
                st2.push(ch);
            }
        }
        return st.equals(st2);
    }
}