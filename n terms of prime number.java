import java.util.*;
//to print the n terms of prime number 
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int d = 0;
      int c =0;
      for(int i=1;;i++){
        for(int j = 1;j<=i;j++){
          if(i%j==0){
            c +=1;
          }
          
        }
        if(c==2){
          System.out.print(i+" ");
          d +=1;
        }
        c = 0;
        if(d==a){
          break;
        }
        
      }
          
  }
}
