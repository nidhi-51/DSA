class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        if(s.length() == 1){
                    return s;
                 }
        for(int start = 0; start < s.length(); start++){
            for(int end = start +1; end <= s.length(); end++){
                 String part = s.substring(start,end);
                  if(palin(part)){
                    if(part.length() > longest.length()){
                      longest = part;
                    }
                }
            }
        }
        return longest;
    }
    static boolean palin(String s){
        int st = 0;
        int e = s.length() - 1;
        while(st < e){
            if(s.charAt(st) != s.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}