class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odds = "";
        String evens = "";
        
        for(int n : num_list){
            if(n%2 == 0)
                evens += String.valueOf(n);
            else
                odds += String.valueOf(n);
        }
        
        int even = Integer.parseInt(evens);
        int odd = Integer.parseInt(odds);
        
        answer = even + odd;
        return answer;
    }
}