import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int c =0;
      int b = 1;
      while(a>0){
        b = a%10;
        c = c+b;
        a = a/10;
      }
      System.out.print(c);
  }
}
