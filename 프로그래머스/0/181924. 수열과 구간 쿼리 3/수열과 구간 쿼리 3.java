class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for(int i = 0; i < queries.length; i++){
            int[] ar = queries[i];
            int a = arr[ar[0]];
            arr[ar[0]] = arr[ar[1]];
            arr[ar[1]] = a;
        }
        
        
        return answer;
    }
}