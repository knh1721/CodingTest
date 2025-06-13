import java.util.*;
class Solution {
    public String solution(String code) {
        String answer = "";
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            char a = code.charAt(i);

            switch(mode){
                case 0 :
                    if(a == '1'){
                        mode = 1;
                    }else if(!(a == '1') && (i%2==0)){
                        ret.append(a);
                    }
                    break;
            
                case 1 :
                    if(a == '1'){
                        mode = 0;
                    }else if(!(a == '1') && !(i%2==0)){
                        ret.append(a);
                    }
                    break;
                    
                default :
                    break;
                }
        }
        
        
        if(ret.toString().equals("")){
            return "EMPTY";
        }else{
            answer = ret.toString();
        }
               
        return answer;
    }
}