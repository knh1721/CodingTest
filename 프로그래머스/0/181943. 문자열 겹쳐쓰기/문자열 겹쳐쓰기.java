class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String a = my_string.substring(0,s);
        StringBuffer sb = new StringBuffer();
        sb.append(a); 
        sb.append(overwrite_string);
        sb.append(my_string.substring(s+overwrite_string.length()));
        answer = sb.toString();
        return answer;
    }
}