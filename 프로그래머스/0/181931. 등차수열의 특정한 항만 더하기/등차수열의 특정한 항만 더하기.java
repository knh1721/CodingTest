class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = included.length;
        
        for(int i = 0; i < n; i++){
            boolean inc = included[i];
            if(inc){
                answer += a+(i*d);
            }
        }
        return answer;
    }
}