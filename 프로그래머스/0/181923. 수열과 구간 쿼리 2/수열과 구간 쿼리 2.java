import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        
        for(int[] ar : queries){
            int first = ar[0];
            int end = ar[1];
            int k = ar[2];
            
            int min = Integer.MAX_VALUE;
            boolean found = false;
            
            for(int i = first; i <= end; i++){
                if(arr[i] > k){
                    min = Math.min(min, arr[i]);
                    found = true;
                }
            }
            
            list.add(found ? min : -1);
        }
        
        Integer[] ans = list.toArray(new Integer[0]);
        int[] answer = new int[ans.length];
        
        for(int j = 0; j < ans.length; j++){
            answer[j] = ans[j];
        }
        return answer;
    }
}