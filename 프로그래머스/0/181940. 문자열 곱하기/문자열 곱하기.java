class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        StringBuffer sum_string = new StringBuffer();
        for (int i = 1; i <= k ; i++){
            sum_string.append(my_string);
        }
        answer = sum_string.toString();
        return answer;
    }
}