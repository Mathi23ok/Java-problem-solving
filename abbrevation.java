
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> l = new ArrayList<>();
        for(int i = 0;i<n;i++){
            l.add(sc.nextLine());
        }
        for(String s : l){
            if(s.length()>10){
                System.out.println(s.charAt(0)+String.valueOf(s.length()-2)+s.charAt(s.length()-1));
            }else{
                System.out.println(s);
            }
        }
        }
    }
//if the word has less than 10 char then print the word 
//if more than 10 char , print the first and last char , and total number of word between them 
