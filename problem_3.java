
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int s = 0;
      for(int i = 1;i<=a;i++){
        int b = sc.nextInt();
        if (b==1){
           s += b*(-1);
           
        }
        else if(b%2!=0){
           s+=b;
        }
      
        else if(b%2==0 && (b/2)%2==0 || b==2){
          s+= b*(-1);
           
        }else{
          s= s+ b;
        }
        System.out.println(s);
      
      }
      
  }
}
