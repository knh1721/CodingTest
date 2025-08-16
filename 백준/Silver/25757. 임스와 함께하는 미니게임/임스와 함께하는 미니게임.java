import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<n; i++){
            set.add(br.readLine());
        }
        
        int count = 0;
        if(game.equals("Y")){ count = 1; }
        else if(game.equals("F")){ count = 2; }
        else if(game.equals("O")){ count = 3; }
        
        System.out.print(set.size()/count);

    }
}