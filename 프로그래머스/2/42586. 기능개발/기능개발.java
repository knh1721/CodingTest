import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
            int n = (int) Math.ceil((double)(100 - progresses[i])/speeds[i]);
            list.add(n);
        }
        
        int prev = list.get(0);
        int count = 1;
        
        for(int k = 1; k < list.size(); k++){
            if(list.get(k) <= prev){
                count++;
            }else{
                answer.add(count);
                count = 1;
                prev = list.get(k);
            }
                
        }
        answer.add(count);
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}