class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
       Stack<Integer> st = new Stack<>();
       for(int i = 0; i < n; i++){
        String s = operations[i];
        if(s.equals("C")){
            st.pop();
        }
        else if(s.equals("D")){
            st.push(2 * st.peek());
        }
        else if(s.equals("+")){
            int top = st.pop();
            int sum = top + st.peek();
            st.push(top);
            st.push(sum);
        }
        else{
            st.push(Integer.parseInt(s));
        }
       }
       int sum = 0; 
        while(st.size() > 0){
            sum = sum + st.pop();
        }
        return sum;
    }
}