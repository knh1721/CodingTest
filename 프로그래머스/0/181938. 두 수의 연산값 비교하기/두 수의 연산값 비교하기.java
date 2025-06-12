class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String AB = Integer.toString(a)+Integer.toString(b);
        String TWO = Integer.toString(2*a*b);
        
        int ab = Integer.parseInt(AB);
        int two = Integer.parseInt(TWO);
        
        if(ab > two)
            answer = ab;
        else
            answer = two;
        
        return answer;
    }
}