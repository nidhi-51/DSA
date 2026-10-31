class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < tickets.length; i++){
            q.add(i);
        }
         int ans = 0;
        while(!q.isEmpty()){
           int index = q.remove();
           tickets[index]--;
           ans++;
           if(tickets[index] > 0){
            q.add(index);
           }
           if(index == k && tickets[index] == 0){
            break;
           }
        }
        return ans;
    }
}