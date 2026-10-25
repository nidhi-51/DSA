class Solution {
    public int evalRPN(String[] tokens) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int a = st.pop();
                int b = st.pop();
                if(tokens[i].equals("+")){
                    ans = b + a;
                }
                else if(tokens[i].equals("-")){
                    ans = b - a;
                }
                else if(tokens[i].equals("*")){
                    ans = b * a;
                }
                else if(tokens[i].equals("/")){
                    ans = b / a;
                }
                st.push(ans);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        if(st.size() == 1){
            ans = st.pop();
        }
        return ans;
    }
}