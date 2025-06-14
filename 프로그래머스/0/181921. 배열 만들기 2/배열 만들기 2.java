import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            String str = String.valueOf(i);
            boolean isValid = true;
            
            for(char ch : str.toCharArray()){
                if(ch != '0' && ch != '5'){
                    isValid = false;
                    break;
                }
            }
            
            if(isValid)
                list.add(i);
        }
        
        if(list.size() == 0)
            list.add(-1);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}