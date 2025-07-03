import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       
        int a = 0;
        char[] c = s.toCharArray();
        for(char ch:c){
           a += ch - 'a' + 1;
            
        }
        System.out.print(a);
        }
    }
