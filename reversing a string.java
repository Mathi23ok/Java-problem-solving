
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //using loop 
        String r = "";
        String t = "";
        for(int i = s.length()-1;i>=0;i--){
            r += s.charAt(i);
        }
        System.out.println(r);
        //using string builder func
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb.toString());
        //using char array 
        char[] ch = s.toCharArray();
        for(int i  = ch.length -1 ;i>=0;i--){
            System.out.print(ch[i]);
            
        }
        
    }
}
