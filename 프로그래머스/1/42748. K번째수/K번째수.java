import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        List<Integer> array_list = new ArrayList<>();
        
        for(int i : array){
            list.add(i);
        }
        
        for(int[] ar : commands){
            int i = ar[0];
            int j = ar[1];
            int k = ar[2];
            
            int[] arr = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(arr);
            array_list.add(arr[k-1]);
        }
        
        return array_list.stream().mapToInt(i->i).toArray();
    }
}