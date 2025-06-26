class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'p' || ch == 'P'){
                p++;
            }else if(ch == 'y' || ch == 'Y'){
                y++;
            }
        }
        
        if(p == y){
            answer = true;
        }else if(p != y){
            answer = false;
        }

        return answer;
    }
}