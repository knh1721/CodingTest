import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for(int i : num_list){
            list.add(i);
        }
        Collections.reverse(list);
        return list.stream().mapToInt(i->i).toArray();
    }
}