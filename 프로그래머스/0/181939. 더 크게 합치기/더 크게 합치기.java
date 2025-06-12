class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = Integer.toString(a)+Integer.toString(b); //a+b
        String B = Integer.toString(b)+Integer.toString(a); //b+a
        
        int ab = Integer.parseInt(A);
        int ba = Integer.parseInt(B);
        
        if(ab < ba)
            answer = ba;
        else
            answer = ab;
        
        return answer;
    }
}