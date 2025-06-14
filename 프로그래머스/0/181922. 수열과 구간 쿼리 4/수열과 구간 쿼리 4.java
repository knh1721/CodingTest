class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //int[] answer = {};
        
        for(int i = 0; i < queries.length; i++){
            int[] ar = queries[i];
            int start = ar[0];
            int end = ar[1];
            int k = ar[2];
            
            for(int j = start; j <= end; j++){
                if(j % k == 0){
                    arr[j] += 1;
                }
            }
        }
        
        return arr;
    }
}