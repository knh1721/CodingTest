import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        a = arr[0]; b = arr[1]; c = arr[2]; d = arr[3];
        
        if(a == d){ return 1111*a;}
        
        else if(a == c && c != d){ return (10*c+d)*(10*c+d);}
        else if(b == d && a != b){ return (10*b+a)*(10*b+a);}
        
        else if(a == b && c == d && b != c){ return (a+c)*(c-a);}
        
        else if(a==b && b!=c && c!=d){ return c*d;}
        else if(a!=b && b==c && c!=d){ return a*d;}
        else if(a!=b && b!=c && c==d){ return a*b;}
        else{ return a;}
    }
}