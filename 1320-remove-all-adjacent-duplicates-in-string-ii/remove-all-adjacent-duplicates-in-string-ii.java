class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st = new Stack<>();
        Stack<Integer> count = new Stack<>();
        for(int i = 0; i <= s.length() - 1; i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek() == ch){
                // count.push(count.pop() + 1);
                count.set(count.size() -1 , count.peek() + 1);
            }
            else{
                st.push(ch);
                count.push(1);
            }
            if(!count.isEmpty() && count.peek() == k){
                st.pop();
                count.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < st.size(); i++){
            for(int j = 0; j < count.get(i); j++){
                sb.append(st.get(i));
            }
        }
        return sb.toString();
    }
}