import java.util.*;
//to print the no of AES number between the range (which has exactly 4 divisor)
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      boolean s = false;
           int b = sc.nextInt();
           int c =0;
           int d =0;
           for(int i =a;i<=b;i++){
             for(int j=1;j<=i;j++){
               if(i%j==0){
                 c +=1;
               }
             }
             if(c==4){
                 d+=1;
                 s = true;
               }
             c = 0;
             if(s){
               System.out.println(i);
  }
             s = false;
             
             }
           
           System.out.printf("Total AES numbers = %d",d);
  }
}
