import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int o = a;
      int b = 0;
      int c = 0;
      while(a > 0){
        b = (b*10)+(a%10);  //reverse number 
        a = a/10;
      }
      if(o==b){   //if palindrome ,check for prime number 
        for(int i = 1;i<=b;i++){
          if(b%i==0){
            c = c + 1;
          }
        }
      }
      if(c==2){
        System.out.print("prime palindrome");
      }else{
        System.out.print("not a prime palindrome");
      }
    
  }
}
