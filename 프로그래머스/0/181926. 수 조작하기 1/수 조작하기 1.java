class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for(int k = 0; k < control.length(); k++){
            char swit = control.charAt(k);
            if(swit == 'w'){ answer += 1; }
            else if(swit == 's'){ answer -= 1; }
            else if(swit == 'd'){ answer += 10; }
            else if(swit == 'a'){ answer -= 10; }
        }
        
        return answer;
    }
}