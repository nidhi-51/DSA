class Solution {
    public List<String> letterCombinations(String digits) {
        return padRet("",digits);
    }
    static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        int start = (digit - 2) * 3;
        int end =  (digit - 1) * 3;

        if(digit == 7){
            end++;
        }
        if(digit == 8){
            start++;
            end++;
        }
        if(digit == 9){
            start ++;
            end += 2;
        }

        for(int i = start ; i < end; i++){
        char ch = (char)('a' + i);
        list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }
}