import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      while(a>0){
       int b = a%10;
         System.out.print(b);
         a = a/10;
        
      }
    
  }
}
