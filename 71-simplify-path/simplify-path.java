class Solution {
    public String simplifyPath(String path) {
      Stack<String> st = new Stack<>();
      String[] parts = path.split("/");
      for(int i = 0; i < parts.length; i++){
        String dir = parts[i];
        if(dir.isEmpty() || dir.equals(".")){

        }
        else if(dir.equals("..") && !st.isEmpty()){
            st.pop();
        }
        else if(!dir.equals("..")){
            st.push(dir);
        }
      }
      StringBuilder ans = new StringBuilder();
      ans.append("/");
      for(String str : st){
        if(ans.length() > 1){  // jab ek dirctory khta hue to check karega
            ans.append("/");
        }
        ans.append(str);
      } 
      return ans.toString(); 
    }
}