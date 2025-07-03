import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder l = new StringBuilder();
        StringBuilder d = new StringBuilder();
        StringBuilder s = new StringBuilder();
        String a = sc.next();
        char[] c = a.toCharArray();
        for(char ch : c){
            if(Character.isLetter(ch)){
                l.append(ch);
            }else if(Character.isDigit(ch)){
                d.append(ch);
            }else{
                s.append(ch);
            }
        }
        System.out.println(l.toString()+d.toString()+s.toString());
      
        }
    }
