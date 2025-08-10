import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Map<String, Integer> map = new HashMap<>();
        String[] input = br.readLine().toLowerCase().split(" ");
        for(String student : input){
            map.put(student, 0);
        }
        
        for(int i = 0; i < n; i++){
            String[] ar = br.readLine().toLowerCase().split(" ");
            for(String name : ar){
                map.put(name, map.get(name)+1);
            }
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> {
            if (b.getValue().equals(a.getValue())) {
                return a.getKey().compareTo(b.getKey());
            }
            return b.getValue() - a.getValue();
        });

        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        
    }
}
