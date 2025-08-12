import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
  
            xMap.put(x, xMap.getOrDefault(x, 0)+1);
            yMap.put(y, yMap.getOrDefault(y, 0)+1);
        }
        
        int count = 0;
        
        for(int i : xMap.values()){
            if(i >= 2){ count++; }
        }
        
        for(int i : yMap.values()){
            if(i >= 2){ count++; }
        }
        System.out.print(count);
            
    }
}