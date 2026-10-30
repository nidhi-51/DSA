class Solution {
    public int firstUniqChar(String s) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            q.add(i);
        }
       while(q.size() > 0){
        int index = q.peek();
        char ch = s.charAt(index);
        if(s.indexOf(ch) == s.lastIndexOf(ch)){
            return index;
        }
        q.remove();
       }
       return -1;
    }
}