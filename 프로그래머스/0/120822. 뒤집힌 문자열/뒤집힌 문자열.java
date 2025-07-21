import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] ch_list = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = ch_list.length-1; i >= 0; i--){
            sb.append(ch_list[i]);
        }
        
        return sb.toString();
    }
    
}