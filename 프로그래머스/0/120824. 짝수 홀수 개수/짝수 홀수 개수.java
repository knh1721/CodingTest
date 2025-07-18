import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i : num_list){
            if(i%2==1){
                list1.add(i);
            }else{
                list2.add(i);
            }
        }
        
        List<Integer> answer = new ArrayList<>();
        answer.add(list2.size());
        answer.add(list1.size());
            
        return answer.stream().mapToInt(i->i).toArray();
    }
}