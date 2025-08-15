import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        int n = Integer.parseInt(st.nextToken()); 
        int m = Integer.parseInt(st.nextToken()); 
        int k = Integer.parseInt(st.nextToken()); 
        
        //과목명, 점수 
        Map<String, Integer> map = new HashMap<>(); 
        
        //n개의 과목명
        for(int i=0; i<n; i++){ 
            st = new StringTokenizer(br.readLine()); 
            String name = st.nextToken(); 
            int score = Integer.parseInt(st.nextToken()); map.put(name, score);
        } 
        
        //필수 과목 나열, k개 채울 때까지 읽기
        String[] ar = new String[k];
        int filled = 0;
        while (filled < k) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens() && filled < k) {
                ar[filled++] = st.nextToken();
            }
        }
        
        //필수 과목 점수, map에서 필수과목 지우기 
        int base = 0; 
        for(String subject : ar){ 
            if(map.containsKey(subject)){ 
                base += map.get(subject); 
                map.remove(subject); 
            } 
        } 
        
        //점수만 모으기
        int[] scores = new int[map.size()];
        int idx = 0; 
        for(int score : map.values()){ 
            scores[idx++] = score; 
        } 
        Arrays.sort(scores);
        
        int need = m - k; //추가 과목 수
        
        //최소, 최대 점수 구하기
        int min = base; 
        int max = base;
        for(int i=0; i<need; i++){ 
            min += scores[i]; 
            max += scores[scores.length - 1 - i];
        } 
        
        System.out.print(min+" "+max); 
    } 
}