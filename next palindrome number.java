import java.util.Scanner;
//next palindrome number
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b ;
      int rev =0;
      for(int i =a+ 1;;i++){
        rev =0;
        b =i;
      while(b>0){
        rev  =rev*10 + b%10;
        b = b/10;
      }
      if(i==rev){
        System.out.print(i);
        break;
      }
      }
      
    
  }
}
