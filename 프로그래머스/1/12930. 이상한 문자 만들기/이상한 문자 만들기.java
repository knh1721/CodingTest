class Solution {
    public String solution(String s) {
        String answer = "";
        String[] string = s.split(" ", -1);
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < string.length; i++) {
            String a = string[i];
            for (int j = 0; j < a.length(); j++) {
                char c = a.charAt(j);
                if (j % 2 == 0)
                    sb.append(Character.toUpperCase(c));
                else
                    sb.append(Character.toLowerCase(c));
            }
            if (i != string.length - 1) {
                sb.append(" ");
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}
