import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(br.readLine());
        }
        
        String[] ar = set.toArray(new String[set.size()]);
        Arrays.sort(ar, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
        });
        
        StringBuilder sb = new StringBuilder();
        for(String str : ar){
            sb.append(str);
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}