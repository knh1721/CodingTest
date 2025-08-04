import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성하세요
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] ar = new String[n];
        
        for(int i=0; i<n; i++){
            ar[i] = sc.nextLine();
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ar[0].length(); i++){
            char ch = ar[0].charAt(i);
            boolean same = true;
            for(int j=1; j<n; j++){
                if(ch != ar[j].charAt(i)){
                    same = false;
                    break;
                }
            }
            
            if(same){
                sb.append(ch);
            }else{
                sb.append('?');
            }
        }
        
        System.out.println(sb.toString());
        
        
    }
}