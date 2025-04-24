import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
     int org = a;
     int n=1;
  int s =0;
     int d =0;
     while(a>0){
       a = a/10;
       d+=1;
     }
     a = org;
     while(a>0){
       int c = a%10;
       for(int i =1;i<=d;i++){
         n =n*c;
       }
          s = s+n;
         n =1;
       a = a/10;
     }
     if(s==org){
       System.out.print("YES");
     }else{
       System.out.print("NO");
     }
    }
}
