class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        HashSet<Character> set = new HashSet<>();
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            freq[ch -'a']--;

            if(set.contains(ch)){
                continue;
            }
            
            while(!st.isEmpty() && st.peek() > ch && freq[st.peek() -'a'] > 0){
                set.remove(st.pop());
            }
            st.push(ch);
            set.add(ch);
        }
        StringBuilder ans = new StringBuilder();
        for(char ch: st){
            ans.append(ch);
        }
        return ans.toString();
    }
}