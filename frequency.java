import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       
        Set<Character> r = new HashSet<>();
        char[] c = s.toCharArray();
        for(char ch:c){
            if(r.contains(ch)){
                System.out.print("no");
                return;
            }else{
                r.add(ch);
            }
            
            
        }
        System.out.print("yes");
        }
    }
