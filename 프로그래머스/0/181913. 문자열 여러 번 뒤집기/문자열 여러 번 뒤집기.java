class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int[] ar : queries){
            int i = ar[0];
            int j = ar[1];
            
            while (i < j) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;

            }
        }
        
        return sb.toString();
    }
}