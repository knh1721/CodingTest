import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        
        for(int n : num_list){
            list.add(n);
        }
        
        if(list.get(list.size() - 1) > list.get(list.size() -2 )){
            int n = list.get(list.size()-1) - list.get(list.size()-2);
            list.add(n);
        }else
            list.add(list.get(list.size()-1)*2);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}